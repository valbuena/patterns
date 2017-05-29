package com.patterns.command.lambda;

import com.patterns.command.common.instructions.Grep;
import com.patterns.command.common.instructions.Join;
import com.patterns.command.common.instructions.Print;
import com.patterns.command.common.instructions.Split;
import com.patterns.command.lambda.Command;
import com.patterns.command.lambda.RemoteControl;
import org.junit.Test;

public class RemoteControlTest {

    Print print = new Print();
    Grep grep = new Grep();
    Join join = new Join();
    Split split = new Split();



    Command[] commands = {() -> {print.print();},() -> {grep.grep();}, () -> {join.join();}, ()->{split.split(); print.print(); grep.grep();} };



    com.patterns.command.lambda.RemoteControl remoteControl = new RemoteControl();



    @Test
    public void testPrintCommand(){
        remoteControl.setCommand(commands);
        remoteControl.executeCommand(0);
    }

    @Test
    public void testGrepCommand(){
        remoteControl.setCommand(commands);
        remoteControl.executeCommand(1);
    }

    @Test
    public void testFileCommand(){
        remoteControl.setCommand(commands);
        remoteControl.executeCommand(2);
    }

    @Test
    public void testMacroCommand(){
        remoteControl.setCommand(commands);
        remoteControl.executeCommand(3);
    }
}
