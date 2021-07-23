package com.aca.week3.Homework03;

public class IntBuffer {
    Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IntBuffer{" +
                "value=" + value +
                '}';
    }
}
