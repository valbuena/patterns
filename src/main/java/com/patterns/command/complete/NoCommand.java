package com.patterns.command.complete;


public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Nothing");
    }

    @Override
    public void undo() {
        System.out.println("Nothing");
    }
}
