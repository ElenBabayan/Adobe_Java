package com.aca.week10.Class18;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Buffer {

    private String value;
    private static List<Thread> threads;

    public synchronized String getValue() throws InterruptedException {
        while(value == null) {
            wait();
        }

        final String tmp = this.value;
        this.value = null;

        System.out.println("Reading from buffer: " + tmp);
        notifyAll();
        return tmp;
    }

    public synchronized void setValue(String value) throws InterruptedException {
        while(this.value != null) {
            wait();
        }

        System.out.println("Setting the value: " + value);
        this.value = value;

        notifyAll(); //waiting state ic durs gan
        // valuen set aneluc heto
    }

    public static void main(String[] args) {
        final Buffer sharedBuffer = new Buffer();

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        sharedBuffer.setValue(UUID.randomUUID().toString());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

        for (int i = 0; i < 10; i++) {
            final Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    String s = null;
                    try {
                        s = sharedBuffer.getValue();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(s);
                }
            });
          //  thread.start();
            threads.add(thread);
        }

        Collections.shuffle(threads);

        for(final Thread thread: threads) {
            thread.start();
        }
    }
}
