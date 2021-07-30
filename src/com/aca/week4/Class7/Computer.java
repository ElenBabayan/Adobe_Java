package com.aca.week4.Class7;

import java.util.Comparator;

// SSD is a Storage
// HDD is a Storage
public class Computer { // Computer has a Storage

    private final Storage storage1;
    private Storage storage2;

    public Storage getStorage1() {
        return storage1;
    }

    public Storage getStorage2() {
        return storage2;
    }

    Computer(Storage storage1, Storage storage2) {
        if(storage1 == null || storage2 == null) {
            throw new NullPointerException();
        }
        this.storage1 = storage1;
        this.storage2 = storage2;

    }

    public void type(Integer memory) throws InterruptedException {
        if(storage1 != null) {
            storage1.write(memory);
        } else if (storage2 != null) {
            storage2.write(memory);
        }
        else {
            throw new RuntimeException("Storage full");
        }
    }
    public void removeStorage2() {
        storage2 = null;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "storage1=" + storage1 +
                ", storage2=" + storage2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
         if(!(o instanceof Computer)) {
             return false;
         }
         Computer obj = (Computer) o;
         if(obj.getStorage1() == null || obj.getStorage2() == null) {
             return false;
         }
         return this.getStorage1().equals(obj.getStorage1()) &&
                 this.getStorage2().equals(obj.getStorage2());
    }

    public static void main(String[] args) throws InterruptedException {
//        SSDStorage storage1 = new SSDStorage();
//        HDDStorage storage2 = new HDDStorage();
//
//        Computer computer1 = new Computer(storage1, storage2);
//        computer1.type(30);
//        System.out.println(computer1);

        SSDStorage storage1 = new SSDStorage();
        HDDStorage storage2 = new HDDStorage();

        storage1.write(20);
        storage2.write(30);

        SSDStorage storage3 = new SSDStorage();
        HDDStorage storage4 = new HDDStorage();

        storage3.write(50);
        storage4.write(60);
        
        Computer computer1 = new Computer(storage1, storage2);
        Computer computer2 = new Computer(storage3, storage4);

        System.out.println(computer1.equals(computer2));

    }
}
