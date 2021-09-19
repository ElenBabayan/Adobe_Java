package com.aca.week9.Class16.task3;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/*
CPU - one operation at a time
CPU core count increased => at any time can do multiple operations at a time

Upload1 - 5% upload - pause - 5 - 5 - 10

Upload2 - 5% upload - pause - 10 - 10 - 10

Upload3 - 0% upload - pause - 5 - 10 - 10

Upload4 - 0% upload - pause - 0 - 5 - 10

- But we do not gain in terms of time

Thread
Parallel execution of the time
...
 */
public class Main {

    public static void main(String[] args) {

        final Thread thread = Thread.currentThread();
        // returns the thread that executes this line
        System.out.println(thread.getName());
        List<FileUploadRunnable> fileUploadRunnableList = returnList();
        runAll(fileUploadRunnableList);

        Thread thread1 = new Thread();

        thread1.start();


        Thread t = new Thread(new Runnable() {
            // run belongs to Runnable interface => cannot write throws x exception
            //=> should enclose in try catch
            @Override
            public void run() {
                int i = 0;
                boolean isRunning = true;
                while (isRunning) {
                    AppUtils.sleep(5);

//                    AppUtils.sleep(1);
//                    System.out.println("print from anonymous runnable");
                    System.err.println("print" + i++);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        isRunning = false;
                        break;
                    }
                }
            }
        });
        thread.start();// call Start to print

        new Thread(new Runnable() {
            @Override
            public void run() {
                AppUtils.sleep(5);
                t.interrupt();
            }
        });

    }

    public static void runAll(List<FileUploadRunnable> fileUploadRunnableList) {
        for (FileOperationRunnable e : fileUploadRunnableList) {
            run(e);
        }
    }

    public void runAllRunnables(List<? extends Runnable> runnableList) {
        for (final Runnable runnable : runnableList) {
            run(runnable);
        }
    }

    public static void run(final Runnable e) {
        Thread thread = new Thread(e);
        thread.run(); // instead of Start -  Run
        
    }

    // List<FileUpl>
    public static List<FileUploadRunnable> returnList() {
        List<FileUploadRunnable> myList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            final File file = new File("C:\\Users\\Elen\\Desktop\\file.txt" + i);
            final FileUploadRunnable runnable = new FileUploadRunnable(file, "http://upload.com");
            //    runnable.run();
            myList.add(runnable);
        }
        return myList;
    }
}
