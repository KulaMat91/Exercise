package org.example.EXP3;

public class Animal {
    public enum Diet{
        UNKNOWN,
        CARNIVORE,
        OMNIVORE,
        VEGETARIAN
    }
    public String name;
    public Diet diet;

    public Animal(String name, Diet diet){
        this.name = name;
        this.diet = diet;
    }

    public void displayName(){
        System.out.printf("This is an Animal called %s" , name);
        System.out.println();
    }
}
