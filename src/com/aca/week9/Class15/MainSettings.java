package com.aca.week9.Class15;

import com.aca.week8.Class14.Settings;

import java.io.*;

public class MainSettings {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final Settings settings = new Settings();
        settings.setProjectName("asdfgh");
        settings.setHeight(10);
        settings.setHeight(15);

        ObjectOutputStream stream= new ObjectOutputStream(
                new FileOutputStream(
                        new File("C:\\Users\\Elen\\Desktop\\file.txt")
                )
        );

        stream.writeObject(settings);

        ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream(
                        new File("C:\\Users\\Elen\\Desktop\\file.txt"))
        );

        final Settings s = (Settings)inputStream.readObject();
//        System.out.println(inputStream.readObject());
//        stream.close();

        PrintWriter printWriter = new PrintWriter(
               new FileOutputStream(
                       new File("C:\\Users\\Elen\\Desktop\\file.txt")
                )
        );

        // writes a line, then deletes the line

        printWriter.println("line1");
        printWriter.println("line2");
        printWriter.println("line3");

        printWriter.close();

        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(
                        new File("C:\\Users\\Elen\\Desktop\\file.txt")
                )
        );

        String line;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();

    }

    /*
    Cloneable

    Serializable
    Marker/Target interface

    Every file has endOfFile marker. EOF
    This way you know where the file ends.

    BufferedReader
    request OS, OS requests hard drive
    bufferedReader - more effective read operation
    due to caching

     */
}