package com.aca.week10.Homework07.task10;

import java.util.List;

public class SafeCartesianSystem {

    private Integer x;
    private Integer y;

    public synchronized int getX()  {
        return this.x;
    }

    public synchronized void setX(int x)  {
        this.x = x;
    }

    public synchronized int getY()  {
        return this.y;
    }

    public synchronized void setY(int y)  {
        this.y = y;
    }

    public static void main(String[] args) throws InterruptedException {
        SafeCartesianSystem safeCartesianSystem = new SafeCartesianSystem();

        new Thread(new Runnable() {
            @Override
            public void run() {
                safeCartesianSystem.setX(1);
                safeCartesianSystem.setY(1);

                safeCartesianSystem.setX(-1);
                safeCartesianSystem.setY(-1);
            }
        }).start();

        Thread.sleep(2000);

        System.out.println(safeCartesianSystem.getX());
        System.out.println(safeCartesianSystem.getY());
    }
}
