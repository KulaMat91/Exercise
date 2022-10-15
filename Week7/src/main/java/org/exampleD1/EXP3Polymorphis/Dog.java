package org.exampleD1.EXP3Polymorphis;

public class Dog extends Animal {

    protected Dog(String name) {
        super(name);
    }

    public void apport() {
        System.out.println("Dog apport!");
    }

    @Override
    public void makeNoise() {
        System.out.println("HAU");
    }
}
