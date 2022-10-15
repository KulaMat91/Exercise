package org.exampleD1.EXP3Polymorphis;

public class Animal {
    protected String name;

    protected Animal(String name){
        this.name =name;
    }

    public void makeNoise(){
    }

    public void sleep(){
        System.out.println("ZZZZ");
    }
}
