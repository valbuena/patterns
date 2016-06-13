package com.patterns.command.full.interfaces;

import com.patterns.command.common.linux.Join;
import com.patterns.command.common.linux.Split;
import com.patterns.command.full.Command;

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
