package com.patterns.command.lambda;


import com.patterns.command.complete.NoCommand;

public class RemoteControl {

    Command[] commands;
    Command undoCommand = ()-> { };



    public void setCommand(Command[] commands) {
        this.commands = commands;
    }

    public void executeCommand(int slot){
        System.out.println("--> EXECUTE A COMMAND : " + this.commands[slot].toString());
        this.commands[slot].execute();
        this.undoCommand = this.commands[slot];
    }

}
