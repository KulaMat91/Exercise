package org.exampleD2.EXP2Interface;

public class Car implements SoundInterface {
    @Override
    public void makeSound() {
        System.out.println("Brrr");
    }
}
