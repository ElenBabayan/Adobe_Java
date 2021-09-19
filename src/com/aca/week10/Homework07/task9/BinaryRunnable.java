package com.aca.week10.Homework07.task9;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class BinaryRunnable implements Runnable {
    @Override
    public void run() {

        Random random = new Random();

        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        File file = new File("C:\\Users\\Elen\\Desktop\\fileBinary.txt\\");
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.println(Integer.toBinaryString(num1));
        printWriter.println(Integer.toBinaryString(num2));
        printWriter.close();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int [] arr = new int[2];
        int index = 0;
        Scanner myReader = null;
        try {
            myReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            arr[index++] = Integer.parseInt(line, 2);
        }

        myReader.close();
        int sum = arr[0] + arr[1];

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(String.valueOf("Appended sum: " + Integer.toBinaryString(sum)));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
