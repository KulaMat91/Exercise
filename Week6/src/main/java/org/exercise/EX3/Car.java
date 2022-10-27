package org.exercise.EX3;

public class Car extends Vehicle implements TankInterface {
    private FuelCar fuelCar;

    Car(String name, FuelCar fuelCar, int numberOfPassenger) {
        super(name);
        this.fuelCar = fuelCar;
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public void tank() {

    }

    @Override
    public void addPassenger() {
        if (numberOfPassenger >= 5) {
            System.out.println("You cannot add more passengers, there are only 5 sits!");
        } else {
            numberOfPassenger += 1;
        }
    }
}
