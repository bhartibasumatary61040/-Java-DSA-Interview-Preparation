package org.java.systemDesign.elevatorsystem;

public class Main {

    public static void main(String[] args) {

        ElevatorSystem system = new ElevatorSystem(3);

        system.displayStatus();

        system.requestElevator(5);

        system.requestElevator(2);

        system.requestElevator(8);

        system.displayStatus();
    }
}
