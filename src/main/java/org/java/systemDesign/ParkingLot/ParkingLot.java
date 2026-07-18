package org.java.systemDesign.ParkingLot;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<ParkingSpot> spots = new ArrayList<>();

    ParkingLot(int totalSpots) {

        for(int i=1;i<=totalSpots;i++){

            spots.add(new ParkingSpot(i));
        }
    }

    public void park(Vehicle vehicle){

        for(ParkingSpot spot : spots){

            if(spot.isAvailable()){

                spot.parkVehicle(vehicle);

                System.out.println(vehicle.getVehicleNumber()
                        +" Parked at Spot "
                        +spot.spotNumber);

                return;
            }
        }

        System.out.println("Parking Full");
    }

    public void remove(String vehicleNumber){

        for(ParkingSpot spot : spots){

            if(!spot.isAvailable()
                    &&
                    spot.vehicle.getVehicleNumber().equals(vehicleNumber)){

                spot.removeVehicle();

                System.out.println(vehicleNumber+" Removed");

                return;
            }
        }

        System.out.println("Vehicle Not Found");
    }

    public void display(){

        System.out.println("\nParking Status");

        for(ParkingSpot spot : spots){

            if(spot.isAvailable()){

                System.out.println("Spot "
                        +spot.spotNumber+
                        " Empty");

            }else{

                System.out.println("Spot "
                        +spot.spotNumber+
                        " -> "
                        +spot.vehicle.getVehicleNumber());
            }
        }
    }
}
