package com.aca.week10.Class17;

public class PrinterRunnable implements Runnable{
    private boolean isRunning = true;
    public void run(){

        while (isRunning){
            AppUtils.sleep(1);
            System.out.println("abc");

        }
    }
    public void stop(){
        isRunning = false;
    }
}