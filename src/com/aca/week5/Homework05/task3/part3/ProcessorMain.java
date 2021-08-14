package com.aca.week5.Homework05.task3.part3;

public class ProcessorMain {

    public static void main(String[] args) {
        X86IntelProcessor x86IntelProcessor = new X86IntelProcessor();
        X8664IntelProcessor x8664IntelProcessor = new X8664IntelProcessor();
        ArmProcessor armProcessor = new ArmProcessor();

        System.out.println(x86IntelProcessor.calculateBinary(25));
        System.out.println(x8664IntelProcessor.calculateBinary(25));
        System.out.println(armProcessor.calculateBinary(25));

        System.out.println(x86IntelProcessor.calculateBinary(884));
        System.out.println(x8664IntelProcessor.calculateBinary(884));
        System.out.println(armProcessor.calculateBinary(884));

        System.out.println(x86IntelProcessor.calculateBinary(721));
        System.out.println(x8664IntelProcessor.calculateBinary(721));
        System.out.println(armProcessor.calculateBinary(721));

    }
}