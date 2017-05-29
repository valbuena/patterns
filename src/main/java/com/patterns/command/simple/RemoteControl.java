package com.patterns.command.simple;

/**
 * Created by pep on 13/06/16.
 */
public class RemoteControl {

    Command command;

    public void setCommand(Command command) {
        System.out.println("--> SET A COMMAND : " + command.toString());
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
