package com.aca.week10.Homework07.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileAnalyzerRunnable {

    /*
    Create an anonymous runnable that analyze the provided files and prints which files contain
    which item from the provided strings. Run the runnable in the main thread
    e.g
    "random 1", "random 2", "random 3", "random 4"

    file0 contains random 1
    file0 contains random 2
    file9 contains random 1
    file9 contains random 3
     */

    public static void main(String[] args) throws InterruptedException {

        List<File> files = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            files.add(new File("C:\\Users\\Elen\\Desktop\\file" + i + ".txt\\"));
        }

        List<String> strings = new ArrayList<>(3);
        strings.add("1");
        strings.add("2");
        strings.add("3");

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < files.size(); i++) {

                    BufferedReader reader = null;
                    String currentLine = "";
                    try {
                        reader = new BufferedReader(new FileReader(files.get(i)));
                        currentLine = reader.readLine();
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    for (int j = 0; j < strings.size(); j++) {
                        if (currentLine.contains(strings.get(j))) {
                            System.out.println(files.get(i).getName() + " contains " + strings.get(j));
                        }
                    }
                }
                System.out.println(Thread.currentThread().getName());
            }
        }).run();

        Thread.sleep(2000);

    }
}
