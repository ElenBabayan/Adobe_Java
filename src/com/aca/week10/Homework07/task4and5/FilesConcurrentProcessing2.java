package com.aca.week10.Homework07.task4and5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilesConcurrentProcessing2 extends Thread implements Runnable {

    private File file;
    private int counter;
    private List<String> list;


    public FilesConcurrentProcessing2(File file) {
        this.file = file;
        list = new ArrayList<>();
    }

    @Override
    public void run() {

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.contains("ab")) {
                    counter++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        list.add(counter + " number of lines of file: " + file.getName() + " contain ab substring");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
