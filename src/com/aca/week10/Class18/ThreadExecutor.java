package com.aca.week10.Class18;

import java.util.concurrent.Executor;

public class ThreadExecutor implements Executor {


    @Override
    public void execute(Runnable command) {
        new Thread(command).start(); //nor threadi vra e execute anum
    }

    public static void main(String[] args) {
        ThreadExecutor threadExecutor = new ThreadExecutor();
        threadExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running 1");
            }
        });
    }
}
