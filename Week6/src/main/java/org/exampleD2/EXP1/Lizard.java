package org.exampleD2.EXP1;

public class Lizard extends Reptile {
    public Lizard(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Lizard noises");

    }
}
