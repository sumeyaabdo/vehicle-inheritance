package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        //Testing Moped class
        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Fuel capacity: " + slowRide.getFuelCapacity());

        //Testing The Car class
        Car myCar = new Car();

        myCar.setColor("Blue");
        myCar.setNumberOfPassengers(4);

        System.out.println("Car color: " + myCar.getColor());
        System.out.println("Passengers: " + myCar.getNumberOfPassengers());
    }
}
