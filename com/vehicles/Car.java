package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle{

    public Car(String vehicleName,String vehicleModelName,String vehicleType){
        super.setVehicleName(vehicleName);
        super.setVehicleModelName(vehicleModelName);
        super.setVehicletype(vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        int maxSpeed=0;
        if(vehicleType.equals("SportsCar")){
            maxSpeed=250;
            return maxSpeed;
        } else if (vehicleType.equals("Cruiser")) {
            maxSpeed=170;
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
