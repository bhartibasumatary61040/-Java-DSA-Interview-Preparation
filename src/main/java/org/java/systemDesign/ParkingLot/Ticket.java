package org.java.systemDesign.ParkingLot;
import java.time.LocalDateTime;
public class Ticket {
    String vehicleNumber;

    LocalDateTime entryTime;

    Ticket(String vehicleNumber){

        this.vehicleNumber = vehicleNumber;

        entryTime = LocalDateTime.now();
    }
}
