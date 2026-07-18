package org.java.designpattern.command;

public class TVOnCommand implements Command{

    private TV tv;

    public TVOnCommand(TV tv) {

        this.tv = tv;
    }

    @Override
    public void execute() {

        tv.turnOn();
    }
}
