package com.aca.week10.Homework07.task4and5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.UUID;
/*
Create a runnable concrete implementation that processes a single 10.000 random line containing file and adds in a shared list string that is a concatenation
of a file name and number of lines that contain "ab" substring in a given file.
Create 10 threads to process 10 files in parallel.

use join() method for each thread to wait for threads termination and print shared list content in the main thread
 */
public class Main2 {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            File file = new File("C:\\Users\\Elen\\Desktop\\file4_" + i + ".txt\\");

            initializeFile(file);

            FilesConcurrentProcessing2 filesConcurrentProcessing = new FilesConcurrentProcessing2(file);

            Thread thread = new Thread(filesConcurrentProcessing);

            Thread.sleep(2000);

            thread.run();
            thread.join();
        }
    }

    private static void initializeFile(File file) {

        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(
                    new FileOutputStream(
                            file
                    )
            );
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            Thread.currentThread().interrupt();
        }

        for (int i = 0; i < 100; i++) {
            printWriter.println(UUID.randomUUID().toString() + "ab");
        }

        if (printWriter != null) {
            printWriter.close();
        }
    }
}
