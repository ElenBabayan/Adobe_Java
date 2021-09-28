package com.aca.week10.Class18;

import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws Exception {
    /*
        time slicing - imitation that threads are working parallel, but not in reality
        we don't have control over the process => drawback of Executor,
        ex. when ended?
        better version - Executor Service
     */
        ExecutorService executor = Executors.newCachedThreadPool(); // decides how many threads ...

        final Buffer sharedBuffer = new Buffer();

        for (int i = 0; i < 10; i++) {
            executor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    sharedBuffer.setValue(UUID.randomUUID().toString());
                    return "";
                }
                /*
                @Override
                public void run() { // run i mej enq kanchum => Mainum chenq grum throws,
                                    // however cannot throw bc of Runnable
                                    // => Callable , which throws exception
                    sharedBuffer.setValue(UUID.randomUUID().toString());

                }*/
            });
        }

        // A Runnable, however, does not return a result and cannot throw a checked exception.
        // Callable returns a value
        for (int i = 0; i < 10; i++) {
            executor.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return sharedBuffer.getValue();
                }

                /*
                @Override
                public void run() {
                    String s = null;
                    try {
                        s = sharedBuffer.getValue();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                //    System.out.println(s);
                }
                */
            });
        }

        /*
        Initiates an orderly shutdown in which previously submitted tasks are executed,
        but no new tasks will be accepted.
        When all runnable ended, all tasks are done => threads stop
         */
        executor.shutdown();
    }
}