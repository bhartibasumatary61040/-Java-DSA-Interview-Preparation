package org.java.designpattern.command;

public class Main {

    public static void main(String[] args) {

        TV tv = new TV();

        Command onCommand = new TVOnCommand(tv);
        Command offCommand = new TVOffCommand(tv);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(onCommand);

        remote.pressButton();

        remote.setCommand(offCommand);

        remote.pressButton();
    }
}
