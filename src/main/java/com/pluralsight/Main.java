package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Testing Moped class
        Moped slowRide = new Moped("Black", 1, 0, 5);


        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Fuel capacity: " + slowRide.getFuelCapacity());

        //Testing The Car class
        Car myCar = new Car("Green", 4, 1, 6);


        System.out.println("Car color: " + myCar.getColor());
        System.out.println("Passengers: " + myCar.getNumberOfPassengers());

        // Testing SemiTruck
        SemiTruck myTruck = new SemiTruck("Yellow", 10, 9, 15);


        System.out.println("Truck color: " + myTruck.getColor());
        System.out.println("Cargo capacity: " + myTruck.getCargoCapacity());

        // Testing Hovercraft
        Hovercraft myHovercraft = new Hovercraft("Red", 20, 15, 30);


        System.out.println("Hovercraft color: " + myHovercraft.getColor());
        System.out.println("Passengers: " + myHovercraft.getNumberOfPassengers());
    }
}
