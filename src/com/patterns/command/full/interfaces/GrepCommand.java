package com.patterns.command.full.interfaces;

import com.patterns.command.common.linux.Grep;
import com.patterns.command.full.Command;


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
