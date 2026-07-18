package org.java.systemDesign.elevatorsystem;

public class Elevator {

    private int elevatorId;
    private int currentFloor;
    private Direction direction;

    public Elevator(int elevatorId) {

        this.elevatorId = elevatorId;
        this.currentFloor = 0;
        this.direction = Direction.IDLE;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void moveToFloor(int floor) {

        if (floor > currentFloor) {
            direction = Direction.UP;
        } else if (floor < currentFloor) {
            direction = Direction.DOWN;
        } else {
            direction = Direction.IDLE;
        }

        System.out.println("Elevator " + elevatorId +
                " moving from Floor " + currentFloor +
                " to Floor " + floor);

        currentFloor = floor;

        direction = Direction.IDLE;

        System.out.println("Elevator " + elevatorId +
                " reached Floor " + currentFloor);
    }
}
