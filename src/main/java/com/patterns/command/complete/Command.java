package com.patterns.command.complete;

public interface Command {

    public void execute();

    public void undo();

    public String toString();
}
