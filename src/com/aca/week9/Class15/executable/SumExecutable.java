package com.aca.week9.Class15.executable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SumExecutable implements Executable {
    private int num;
    private boolean flag;

    public SumExecutable(int num, boolean flag) {
        this.num = num;
        this.flag = flag;
    }

    @Override
    public void execute() throws FileNotFoundException {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        String str = ExecutableType.SUM_EXECUTABLE.toString() + " " + result;

        if (!flag) {
            SystemResultPrinter systemResultPrinter = new SystemResultPrinter();
            systemResultPrinter.print(str);
        } else {
            FileResultPrinter fileResultPrinter = new FileResultPrinter();
            fileResultPrinter.print(str);
        }
    }

    @Override
    public ExecutableType getType() {
        return ExecutableType.SUM_EXECUTABLE;
    }
}
