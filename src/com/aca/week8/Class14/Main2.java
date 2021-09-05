package com.aca.week8.Class14;

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Main2 {
/*
keeps programs in File
1. as text
2. as binary data - better performance, less space,
but hard to work with

OR use
Formatter
Scanner classes, to avoid Streams
 */
    public static void main(String[] args) throws IOException {

        Formatter formatter = new Formatter("C:\\Users\\Elen\\Desktop\\file.txt");

        // expect String format, and pass the String
        formatter.format("%s", "content");

        // Flush - apply on file
        formatter.flush();
        formatter.close();

        Settings settings = new Settings(25,12,"ProjectName");

        Main2 main2 = new Main2();
        main2.save(settings);

        System.out.println(read().getWidth());
        System.out.println(read().getHeight());
        System.out.println(read().getProjectName());

        File file = new File("C:\\Users\\Elen\\Desktop\\file.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        byte[] bytes = {0x28, 0x30, 0x29};
        fileOutputStream.write(bytes);
        fileOutputStream.close();


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(
                        new File("C:\\Users\\Elen\\Desktop\\file.txt")
                )
        );
        objectOutputStream.write(4);
        objectOutputStream.writeInt(4);
        objectOutputStream.writeInt(50);
        objectOutputStream.close();
    }

    public void save(Settings s) throws FileNotFoundException {
        int height = s.getHeight();
        int width = s.getWidth();
        String projectName = s.getProjectName();
        Formatter formatter = new Formatter("C:\\Users\\Elen\\Desktop\\file.txt");
        formatter.format("%d %d %s", height, width, projectName);

        formatter.flush();
        formatter.close();

    }

    public static Settings read() throws FileNotFoundException {
        File file = new File("C:\\Users\\Elen\\Desktop\\file.txt");
        Scanner kb = new Scanner(file);

        int height = kb.nextInt();
        int width = kb.nextInt();
        String projectName = kb.next();

        return new Settings(width, height, projectName);

    }


}
