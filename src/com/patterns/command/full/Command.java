package com.patterns.command.full;

public interface Command {

    public void execute();

    public void undo();

    public String toString();
}
