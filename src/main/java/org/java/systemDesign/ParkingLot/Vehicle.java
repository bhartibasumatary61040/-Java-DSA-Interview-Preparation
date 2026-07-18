package org.java.systemDesign.ParkingLot;

public class Vehicle {

    String vehicleNumber;
    VehicleType type;

    Vehicle(String vehicleNumber, VehicleType type) {

        this.vehicleNumber = vehicleNumber;
        this.type = type;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleType getType() {
        return type;
    }
}
