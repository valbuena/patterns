package com.patterns.command.complete;

import com.patterns.command.complete.interfaces.FileCommand;
import com.patterns.command.complete.interfaces.GrepCommand;
import com.patterns.command.complete.interfaces.PrintCommand;
import org.junit.Test;

public class RemoteControlTest {

    PrintCommand printCommand = new PrintCommand();
    GrepCommand grepCommand = new GrepCommand();
    FileCommand fileCommand = new FileCommand();

    Command[] commands = {printCommand, grepCommand, fileCommand};


    MacroCommand macroCommand = new MacroCommand(commands);


    RemoteControl remoteControl = new RemoteControl();

    @Test
    public void testPrintCommand(){
        remoteControl.setCommand(commands);
        remoteControl.executeCommand(0);
        remoteControl.undoCommand();
    }

    @Test
    public void testGrepCommand(){
        remoteControl.setCommand(commands);
        remoteControl.executeCommand(1);
        remoteControl.undoCommand();
    }

    @Test
    public void testFileCommand(){
        remoteControl.setCommand(commands);
        remoteControl.executeCommand(2);
        remoteControl.undoCommand();
    }

    @Test
    public void testMacroCommand(){
        Command[] commands = {macroCommand};
        remoteControl.setCommand(commands);
        remoteControl.executeCommand(0);
        remoteControl.undoCommand();
    }
}
