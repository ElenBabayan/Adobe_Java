package com.aca.week10.Class17;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test implements Runnable {
    public static void main(String[] args) throws IOException {
        Thread thread = new Thread(new Test(new PrintWriter(new FileWriter("C:\\Users\\Karen\\Desktop\\file.txt"))));
        thread.start();
        AppUtils.sleep(5);
        thread.interrupt();
    }
    private final PrintWriter printWriter;

    public Test(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            printWriter.println("abc");
            AppUtils.sleep(1);
        }
        printWriter.close();
    }
}