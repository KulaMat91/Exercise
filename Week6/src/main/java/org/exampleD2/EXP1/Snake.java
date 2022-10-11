package org.exampleD2.EXP1;

public class Snake extends Reptile{
    public Snake(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Ssssss");
    }
}
