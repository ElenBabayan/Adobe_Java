package com.aca.week10.Class17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FilePrinterRunnable implements Runnable{

    // file stana drsic

    // file i mej enqan tpi minchev interrupt kanchen
    // file stop lini henc kanchen

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

        // writes a line, then deletes the line

        printWriter.println("line1");
        while(!Thread.currentThread().isInterrupted()) {

            printWriter.println("abc");
        }

        if(printWriter != null) {
            printWriter.close();
        }
    }
}
