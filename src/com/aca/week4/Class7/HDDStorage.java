package com.aca.week4.Class7;

import com.aca.week3.Class6.StartPoint1;

import java.util.concurrent.TimeUnit;

public class HDDStorage implements Storage {

    private Integer memory;

    public Integer getMemory() {
        return memory;
    }

    @Override
    public void write(Integer memory) {
        System.out.println("HDD write started");
        Utils.sleep(1000);
        this.memory = memory;
        System.out.println("Finished writing");
    }

    @Override
    public Integer read() {
        return memory;
    }

    @Override
    public String toString() {
        return "HDDStorage{" +
                "memory=" + memory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Storage)) {
            return false;
        }

        Storage obj = (Storage) o;
        return obj.read().equals(this.read());

    }
}
