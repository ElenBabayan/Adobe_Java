package com.aca.week10.Homework07.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.UUID;

/*
Create a runnable implementation that prints 10.000 random lines in the provided file.
Run the runnable in the main thread.
 */
public class RunnableImpl implements Runnable {

    private File file;

    public void run() {

        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(
                    new FileOutputStream(
                            new File("C:\\Users\\Elen\\Desktop\\file.txt\\")
                    )
            );
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            Thread.currentThread().interrupt();
        }

        for (int i = 1; i <= 10000; i++) {
            printWriter.println(UUID.randomUUID().toString());
        }

        if (printWriter != null) {
            printWriter.close();
        }
    }

    public static void main(String[] args) {

        RunnableImpl runnable = new RunnableImpl();
        runnable.run();
    }
}
