package org.exampleD2.EXP1;

// klasa abstrakcyjna szablon dla klas, nie może mieć obiektów
public abstract class Animal {
    public String name;

    protected Animal(String name) {
        this.name = name;
    }

    // meotda abstrakcyjna obliguje, aby nadpisać tą metodę w klasch nieabstrakcyjnych, które dziedzczą tą klasę
    public abstract void makeNoise();

    public void sleep() {
        System.out.println("Zzzzzzz");
    }
}
