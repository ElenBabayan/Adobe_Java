package com.aca.week10.Homework07.task9;

import java.io.*;
import java.util.Random;

/*
Create an application that prints 2 random integers in a file in binary format and closes it.
Move the main thread to sleep state for 10 seconds then read 2 integers from the file and append the sum of 2 integers to a file.
 */
public class BinaryFile {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        BinaryRunnable binaryRunnable = new BinaryRunnable();

        binaryRunnable.run();

    }

}
