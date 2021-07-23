package com.aca.week3.Homework03;

public class LinkedIntBuffer extends IntBuffer {

    private LinkedIntBuffer next;

    public LinkedIntBuffer getNext() {
        return next;
    }

    public void setNext(LinkedIntBuffer next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value + "->" + next;
    }

    public static void main(String[] args) {
        LinkedIntBuffer linkedIntBuffer = new LinkedIntBuffer();
        linkedIntBuffer.setValue(0);

        LinkedIntBuffer linkedIntBuffer1 = new LinkedIntBuffer();
        linkedIntBuffer1.setValue(1);
        linkedIntBuffer.setNext( linkedIntBuffer1);

        LinkedIntBuffer linkedIntBuffer2 = new LinkedIntBuffer();
        linkedIntBuffer2.setValue(2);
        linkedIntBuffer1.setNext(linkedIntBuffer2);

        LinkedIntBuffer linkedIntBuffer3 = new LinkedIntBuffer();
        linkedIntBuffer3.setValue(3);
        linkedIntBuffer2.setNext(linkedIntBuffer3);

        System.out.println(linkedIntBuffer.toString());

        IntBuffer intBuffer = new IntBuffer();
        intBuffer.setValue(5);
        System.out.println(intBuffer.toString());
    }
}
