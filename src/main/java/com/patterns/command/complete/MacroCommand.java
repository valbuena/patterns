package com.patterns.command.complete;


import java.util.stream.Stream;

public class MacroCommand implements  Command{

    Command[] commands;

    public MacroCommand (Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {

        Stream.of(this.commands).forEach(
                command -> command.execute()
        );

    }

    @Override
    public void undo() {
        Stream.of(this.commands).forEach(
                command -> command.undo()
        );
    }

    @Override
    public String toString() {
        return "MACRO";
    }
}
