package org.exampleD1.EXP3Polymorphis;

public class Cat extends Animal{

    protected Cat(String name) {
        super(name);
    }

    public void lickFur(){
    }
    @Override
    public void makeNoise() {
        System.out.println("MIAU");
    }
}
