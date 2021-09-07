package com.aca.week9.Class15.executable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FactorialExecutable implements Executable {

    private int num;
    private boolean flag;

    public FactorialExecutable(int num, boolean flag) {
        this.num = num;
        this.flag = flag;
    }

    @Override
    public void execute() throws FileNotFoundException {
        int result = executeHelper(num);

        String str = ExecutableType.FACTORIAL_EXECUTABLE.toString() + " " + result;
        if (!flag) {
            SystemResultPrinter systemResultPrinter = new SystemResultPrinter();
            systemResultPrinter.print(str);
        } else {
            FileResultPrinter fileResultPrinter = new FileResultPrinter();
            fileResultPrinter.print(str);
        }
    }

    private int executeHelper(int num) {
        if (num == 1)
            return 1;

        return num * executeHelper(num - 1);
    }

    @Override
    public ExecutableType getType() {
        return ExecutableType.FACTORIAL_EXECUTABLE;
    }
}
