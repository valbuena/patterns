package com.patterns.command.simple.interfaces;

import com.patterns.command.simple.Command;
import com.patterns.command.common.linux.Print;

public class PrintCommand implements Command {

    Print print = new Print();

    @Override
    public void execute() {
        print.print();
    }

    @Override
    public String toString() {
        return "PRINT";
    }
}
