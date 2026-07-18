package org.java.systemDesign.ParkingLot;

public class ParkingSpot {

    int spotNumber;

    boolean occupied;

    Vehicle vehicle;

    ParkingSpot(int spotNumber) {

        this.spotNumber = spotNumber;
    }

    public boolean isAvailable() {

        return !occupied;
    }

    public void parkVehicle(Vehicle vehicle) {

        this.vehicle = vehicle;
        occupied = true;
    }

    public void removeVehicle() {

        vehicle = null;
        occupied = false;
    }
}
