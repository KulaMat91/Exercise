package org.example.EXP3;

public class Reptile extends Animal {
    public int anmountOfEggs;

    public Reptile(String name, Diet diet, int anmountOfEggs) {
        super(name, diet);
        this.anmountOfEggs = anmountOfEggs;
    }

    public void layEggs() {
        System.out.printf("Laid %d eggs", anmountOfEggs);
        System.out.println();
    }

    @Override
    public void displayName() {
        super.displayName();
        System.out.println("And I.m a reptile too!");
    }

}
