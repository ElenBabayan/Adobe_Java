package com.aca.week9.Class15.executable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileResultPrinter implements ResultPrinter {

    private static final String FILE_PATH = "C:\\Users\\Elen\\Desktop\\file.txt";

    @Override
    public void print(String s) {

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(
                    new FileOutputStream(
                            new File(FILE_PATH)
                    )
            );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.println(s);
        printWriter.close();

    }
}
