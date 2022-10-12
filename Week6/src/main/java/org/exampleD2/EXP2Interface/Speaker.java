package org.exampleD2.EXP2Interface;

// mozna zastosowac wiecej niz jeden interface
public class Speaker implements SoundInterface, ElectricDeviceInterface {
    private boolean pluggedIn;

    @Override
    public void makeSound() {
        System.out.println("Music");
    }

    @Override
    public void plugIn() {
        System.out.println("Speaker plug in");
        pluggedIn = true;
    }

    @Override
    public void unplug() {
        System.out.println("Speaker unplugged");
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
