package com.patterns.command.complete;


public class RemoteControl {

    Command[] commands;
    Command undoCommand = new NoCommand();



    public void setCommand(Command[] commands) {
        this.commands = commands;
    }

    public void executeCommand(int slot){
        System.out.println("--> EXECUTE A COMMAND : " + this.commands[slot].toString());
        this.commands[slot].execute();
        this.undoCommand = this.commands[slot];
    }

    public void undoCommand(){
        System.out.println("--> UNDO COMMAND : " + this.undoCommand.toString());
        this.undoCommand.undo();
    }
}
