package org.exampleD2.EXP2Interface;

public class Human extends Animal implements SoundInterface {
    @Override
    public void makeSound() {
        System.out.println("Hello world");
    }

    @Override
    public void eat(){
        System.out.println("Human eating.");
    }

    public void goToWork(){
        System.out.println("Go to work");
    }
}
