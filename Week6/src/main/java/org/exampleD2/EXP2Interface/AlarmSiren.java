package org.exampleD2.EXP2Interface;

public class AlarmSiren implements SoundInterface, ElectricDeviceInterface {
    private boolean pluggedIn;

    @Override
    public void makeSound() {
        System.out.println("OOOO");
    }

    @Override
    public void plugIn() {
        System.out.println("Siren plug in");
        pluggedIn = true;
    }

    @Override
    public void unplug() {
        System.out.println("Siren unplugged");
        pluggedIn = false;
    }

    @Override
    public void consumePower(double watts) {
        if (!pluggedIn) {
            System.out.println("Cannot consumer power while unplugged!");
        }
    }

    @Override
    public void use() {
        makeSound();
    }

    @Override
    public void consumePower(Double watts) {

    }
}
