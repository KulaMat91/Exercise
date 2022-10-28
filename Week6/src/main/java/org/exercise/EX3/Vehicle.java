package org.exercise.EX3;

public abstract class Vehicle {
    protected String name;
    protected String driveType;
    protected int numberOfPassenger;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", driveType='" + driveType + '\'' +
                ", numberOfPassenger=" + numberOfPassenger +
                '}';
    }
}
