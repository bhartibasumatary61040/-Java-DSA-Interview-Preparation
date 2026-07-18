package org.java.designpattern.command;

public class TVOffCommand implements Command{

    private TV tv;

    public TVOffCommand(TV tv) {

        this.tv = tv;
    }

    @Override
    public void execute() {

        tv.turnOff();
    }
}
