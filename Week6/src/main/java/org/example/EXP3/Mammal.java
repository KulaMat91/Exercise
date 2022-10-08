package org.example.EXP3;

public class Mammal extends Animal{
    public Integer amountOfUdders;
    public Mammal(String name, Diet diet, Integer amountOfUdders){
        super(name,diet);
        this.amountOfUdders = amountOfUdders;
    }

    public void drinkMotherMilk(Mammal mother){
        System.out.printf("%s drinks milk from %s", this.name, mother.name);
        System.out.println();
    }
    @Override
    public void displayName(){
        System.out.printf("This is a Mammal called %s" , name);
        System.out.println();
    }
}
