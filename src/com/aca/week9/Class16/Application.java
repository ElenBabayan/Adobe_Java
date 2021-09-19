package com.aca.week9.Class16;

public class Application {

    private final ResultPrinter resultPrinter;

    public Application(ResultPrinter resultPrinter) {
        this.resultPrinter = resultPrinter;
    }

    public void calculateAndPrint(int number){
        resultPrinter.print(String.valueOf(number / 2));
    }

    // constr
    // jaranf override => subclass obj create aneuc nullptr

}
