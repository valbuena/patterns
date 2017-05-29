package com.patterns.command.complete.interfaces;

import com.patterns.command.common.instructions.Grep;
import com.patterns.command.complete.Command;


public class GrepCommand implements Command {

    Grep grep = new Grep();

    @Override
    public void execute() {
        grep.grep();
    }

    @Override
    public void undo() {
        grep.remove();
    }


    @Override
    public String toString() {
        return "GREP";
    }
}
