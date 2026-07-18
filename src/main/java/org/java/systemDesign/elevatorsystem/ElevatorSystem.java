package org.java.systemDesign.elevatorsystem;
import java.util.ArrayList;
import java.util.List;
public class ElevatorSystem {

    private List<Elevator> elevators = new ArrayList<>();

    public ElevatorSystem(int totalElevators) {

        for (int i = 1; i <= totalElevators; i++) {

            elevators.add(new Elevator(i));
        }
    }

    public void requestElevator(int floor) {

        Elevator selected = elevators.get(0);

        int minDistance = Math.abs(selected.getCurrentFloor() - floor);

        for (Elevator elevator : elevators) {

            int distance = Math.abs(elevator.getCurrentFloor() - floor);

            if (distance < minDistance) {

                minDistance = distance;
                selected = elevator;
            }
        }

        System.out.println("\nAssigning Elevator " + selected.getElevatorId());

        selected.moveToFloor(floor);
    }

    public void displayStatus() {

        System.out.println("\nElevator Status");

        for (Elevator elevator : elevators) {

            System.out.println(
                    "Elevator " + elevator.getElevatorId() +
                            " | Floor : " + elevator.getCurrentFloor() +
                            " | Direction : " + elevator.getDirection()
            );
        }
    }


}
