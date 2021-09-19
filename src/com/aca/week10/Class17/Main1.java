package com.aca.week10.Class17;

public class Main1 {
    public static void main(String[] args) {
        PrinterRunnable printerRunnable = new PrinterRunnable();
        new Thread(printerRunnable).start();
        AppUtils.sleep(5);
        printerRunnable.stop();

        boolean isRunning = true;
        RunnableController runnableController = new RunnableController();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(runnableController.isRunning()) {
                    AppUtils.sleep(1);
                    System.out.println("abc");
                }
            }
        });
        thread.start();
        runnableController.setRunning(false);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
