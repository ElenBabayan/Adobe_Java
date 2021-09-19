package com.aca.week10.Homework07.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
Create 10 files (file0.txt, ... file9.txt) each containing 10.000 random lines and run in the main thread.
 */

public class FileGeneratorRunnable implements Runnable {

    public FileGeneratorRunnable(List<File> files) {
        this.files = files;
    }

    private List<File> files;

    @Override
    public void run() {

        for (int i = 0; i < files.size(); i++) {

            PrintWriter printWriter = null;

            try {
                printWriter = new PrintWriter(
                        new FileOutputStream(
                                files.get(i)
                        )
                );
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                Thread.currentThread().interrupt();
            }

            for (int j = 1; j <= 10000; j++) {
                printWriter.println(UUID.randomUUID().toString());
            }

            if (printWriter != null) {
                printWriter.close();
            }
        }
    }

    public static void main(String[] args) {
        List<File> files = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            files.add(new File("C:\\Users\\Elen\\Desktop\\file" + i + ".txt\\") );
        }

        FileGeneratorRunnable fileGeneratorRunnable = new FileGeneratorRunnable(files);

        fileGeneratorRunnable.run();
    }

}
