package com.patterns.command.simple.interfaces;

import com.patterns.command.simple.Command;
import com.patterns.command.common.instructions.Grep;


public class GrepCommand implements Command {

    Grep grep = new Grep();

    @Override
    public void execute() {
        grep.grep();
    }

    @Override
    public String toString() {
        return "GREP";
    }
}
