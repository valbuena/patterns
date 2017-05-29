package com.patterns.command.complete.interfaces;

import com.patterns.command.common.instructions.Join;
import com.patterns.command.common.instructions.Split;
import com.patterns.command.complete.Command;

public class FileCommand implements Command {

    Join join = new Join();
    Split split = new Split();


    @Override
    public void execute() {
        join.join();
    }

    @Override
    public void undo() {
        split.split();
    }

    @Override
    public String toString() {
        return "FILE";
    }
}
