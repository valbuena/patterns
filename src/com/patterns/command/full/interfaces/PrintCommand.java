package com.patterns.command.full.interfaces;

import com.patterns.command.common.linux.Print;
import com.patterns.command.full.Command;

/**
 * Created by pep on 13/06/16.
 */
public class PrintCommand implements Command {

    Print print = new Print();


    @Override
    public void execute() {
        print.print();
    }

    @Override
    public void undo() {
        print.remove();
    }


    @Override
    public String toString() {
        return "PRINT";
    }
}
