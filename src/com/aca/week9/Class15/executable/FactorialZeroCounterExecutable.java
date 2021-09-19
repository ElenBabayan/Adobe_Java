package com.aca.week9.Class15.executable;

import java.io.FileNotFoundException;

public class FactorialZeroCounterExecutable implements Executable {

    private int num;
    private boolean flag;

    public FactorialZeroCounterExecutable(int num, boolean flag) {
        this.num = num;
        this.flag = flag;
    }

    @Override
    public void execute() throws FileNotFoundException {
        int result = executeHelper(num);
        String strResult = Integer.toString(result);

        int numOfZeros = 0;
        for (int i = strResult.length() - 1; i >= 0; i--) {
            if (strResult.charAt(i) == '0') {
                numOfZeros++;
            } else {
                break;
            }
        }

        String str = ExecutableType.FACTORIAL_ZERO_COUNTER_EXECUTABLE.toString() + " " + numOfZeros;

        if (!flag) {
            SystemResultPrinter systemResultPrinter = new SystemResultPrinter();
            systemResultPrinter.print(str);
        } else {
            FileResultPrinter fileResultPrinter = new FileResultPrinter();
            fileResultPrinter.print(str);
        }

    }

    private int executeHelper(int num) {
        if (num == 1 || num == 0)
            return 1;

        return num * executeHelper(num - 1);
    }

    @Override
    public ExecutableType getType() {
        return ExecutableType.FACTORIAL_ZERO_COUNTER_EXECUTABLE;
    }
}
