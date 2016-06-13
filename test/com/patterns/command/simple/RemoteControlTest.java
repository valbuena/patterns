package com.patterns.command.simple;

import com.patterns.command.simple.interfaces.GrepCommand;
import com.patterns.command.common.linux.Grep;
import com.patterns.command.common.linux.Print;
import com.patterns.command.simple.interfaces.PrintCommand;
import org.junit.Test;

public class RemoteControlTest {

    PrintCommand printCommand = new PrintCommand();
    GrepCommand grepCommand = new GrepCommand();
    RemoteControl remoteControl = new RemoteControl();

    @Test
    public void testPrintCommand(){
        remoteControl.setCommand(printCommand);
        remoteControl.executeCommand();
    }

    @Test
    public void testGrepCommand(){
        remoteControl.setCommand(grepCommand);
        remoteControl.executeCommand();
    }
}
