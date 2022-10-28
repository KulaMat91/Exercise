package org.exercise.EX3;

public class Car extends Vehicle implements TankInterface {
    private Fuel fuel;

    Car(String name, Fuel fuel, int numberOfPassenger) {
        super(name);
        this.fuel = fuel;
        this.numberOfPassenger = numberOfPassenger;
    }

    public Fuel getFuel() {
        return fuel;
    }

    @Override
    public void tank(Fuel fuel) {
        if (fuel.equals(this.fuel)) {
            System.out.println("You car is now full of fuel");
        } else {
            System.out.println("Wrong type of fuel!");
        }

    }

    @Override
    public void addPassenger() {
        if (numberOfPassenger >= 5) {
            System.out.println("You cannot add more passengers, there are only 5 sits!");
        } else {
            numberOfPassenger++;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel=" + fuel +
                ", name='" + name + '\'' +
                ", numberOfPassenger=" + numberOfPassenger +
                "} " + super.toString();
    }
}
