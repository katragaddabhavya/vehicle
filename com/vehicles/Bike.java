package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle{

    public Bike(String vehicleName,String vehicleModelName,String vehicleType){
        super.setVehicleName(vehicleName);
        super.setVehicleModelName(vehicleModelName);
        super.setVehicletype(vehicleType);
    }
    public int maxSpeed(String vehicleType){
        int maxSpeed=0;
        if (vehicleType.equals("sportsBike")){
            maxSpeed=250;
            return maxSpeed;
        }
        else if (vehicleType.equals("Cruiser")){
            maxSpeed=140;
            return maxSpeed;
        }
        else {
            return maxSpeed;
        }
    }

    public String getManufacturerInformation(){
        return "VehicleManufacturer{"+"VehicleName="+getVehicleName()+",Vehicle Model Name"+getVehicleModelName()+"Vehicle Type"+getVehicletype()+"}";

    }

}