package org.java.designpattern.observer;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {

        this.name = name;
    }

    @Override
    public void update(String message) {

        System.out.println(name + " received notification : " + message);
    }
}
