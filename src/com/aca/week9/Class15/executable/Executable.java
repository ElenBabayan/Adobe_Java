package com.aca.week9.Class15.executable;

import java.io.FileNotFoundException;

public interface Executable {

    void execute() throws FileNotFoundException;

    ExecutableType getType();

}
