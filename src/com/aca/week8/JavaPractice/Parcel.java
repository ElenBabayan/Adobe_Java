package com.aca.week8.JavaPractice;

import java.io.Serializable;

class Parcel<T extends Gift , Wrappable , Exchangeable>{
    private T t;
    public void set( T t) {
        this.t = t;
    }
    public void shipParcel() {
        if (t.getWeight() > 10)
            System.out.println("Ship by courier ABC");
        else
            System.out.println("Ship by courier XYZ");
    }
}

