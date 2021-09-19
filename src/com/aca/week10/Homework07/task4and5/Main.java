package com.aca.week10.Homework07.task4and5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            File file = new File("C:\\Users\\Elen\\Desktop\\file4_" + i + ".txt\\");

            initializeFile(file);

            FilesConcurrentProcessing filesConcurrentProcessing = new FilesConcurrentProcessing(file);

            Thread thread = new Thread(filesConcurrentProcessing);

            Thread.sleep(2000);

            thread.start();

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
