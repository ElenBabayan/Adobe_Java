package com.aca.week10.Homework07.task4and5;

/*
Create a runnable concrete implementation that processes a single 10.000 random line
containing file and prints how many lines contain "ab" substring in a given file.

Create 10 threads to process 10 files in parallel.

output example:
file0.txt 124
file7.txt 1000
file9.txt 2
...
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilesConcurrentProcessing extends Thread implements Runnable {

    private File file;
    private int counter;

    public FilesConcurrentProcessing(File file) {
        this.file = file;
    }

    @Override
    public  void run() {

            try (BufferedReader reader =  new BufferedReader(new FileReader(file))){
                String currentLine;

                while((currentLine = reader.readLine()) != null) {
                    if(currentLine.contains("ab")) {
                        counter++;
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

           System.out.println(counter + " number of lines of file: " + file.getName() + " contain ab substring " +
                   "in " + Thread.currentThread().getName());
        }
    }