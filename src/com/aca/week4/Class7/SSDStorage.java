package com.aca.week4.Class7;

public class SSDStorage implements Storage {

    private Integer memory;

    public Integer getMemory() {
        return memory;
    }

    @Override
    public void write(Integer memory)  {
        System.out.println("SSD write started");
        Utils.sleep(100);
        this.memory = memory;
        System.out.println("Finished writing");
    }

    @Override
    public Integer read() {
        return memory;
    }

    @Override
    public String toString() {
        return "SSDStorage{" +
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
