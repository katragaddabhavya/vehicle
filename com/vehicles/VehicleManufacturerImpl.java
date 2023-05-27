package com.vehicles;
public class VehicleManufacturerImpl {
    public static void main(String[] args) {
        VehicleManufacturer bike=new Bike("honda","12h","SBike");
        Vehicle v1=new Bike("honda","12h","Bike");
        int speed= v1.maxSpeed(bike.getVehicletype());
        System.out.println("Bike type is: "+bike.getVehicletype()+" Max Speed is: "+speed);
        System.out.println(bike.getManufacturerInformation());

        VehicleManufacturer car=new Car("BMW","A6","SCar");
        Vehicle v2=new Car("BMW","A6","Car");
        int carspeed=v2.maxSpeed(car.getVehicletype());
        System.out.println("Car type is: "+car.getVehicletype()+"Max Speed is: "+carspeed);
        System.out.println(car.getManufacturerInformation());

    }
}