package com.aca.week9.Class15.executable;

import java.io.FileNotFoundException;
import java.util.Scanner;

public interface Executable {

    void execute() throws FileNotFoundException;

    ExecutableType getType();

}
