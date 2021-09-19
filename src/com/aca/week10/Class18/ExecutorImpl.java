package com.aca.week10.Class18;

import java.util.concurrent.Executor;

public class ExecutorImpl implements Executor {

    @Override
    public void execute(Runnable command) {
        command.run();  // kashxati en threadum voric runy kanchvel a, es depqum Main thready
     //   new Thread(command).start();
    }


    public static void main(String[] args) {
        ExecutorImpl executor = new ExecutorImpl();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running");
            }
        });
    }
}
