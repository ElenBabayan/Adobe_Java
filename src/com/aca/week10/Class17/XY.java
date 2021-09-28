package com.aca.week10.Class17;

public class XY {

    // 2 thread grel setX setY 1 1 2 2 3 3 4 4.. amen vrk shatana
    // myus threadn el 0 0  -1 -1 -2 -2

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {

        XY xy = new XY();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (true) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    xy.setX(count);
                    xy.setY(count);

                    try {
                        printXY(xy);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Utils.check(xy);
                    try {
                        printXY(xy);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        int count = 0;
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            xy.setY(count);
            xy.setX(count);
            count--;
        }

    }

    public static void printXY(XY xy) throws InterruptedException {
        Thread.sleep(300);
        System.out.println(xy.getX() + " " + xy.getY());
    }
}
