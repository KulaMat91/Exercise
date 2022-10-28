package org.example.EXP3;

public class Human extends Mammal {
    public String nationality;

    public Human(String name, Diet diet, String nationality) {
        super(name, diet, 2);
        this.nationality = nationality;
    }

    //Two overloads of methods
    //Each overload must have unique method signiature
    //Method signiature - name and parameters(types, amount, order)
    public void speak() {
        System.out.println("Hello word!");
    }

    public void speak(String name) {
        System.out.printf("Hello %s!", name);
        System.out.println();
    }


    @Override
    public void displayName() {
        speak("Mario");
        System.out.printf("This is a Human called %s", name);
        System.out.println();
    }
}
