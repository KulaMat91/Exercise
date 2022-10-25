package org.example.EXP3;

//INHERITANCE
public class Main {
    public static void main(String[] args) {

        Animal salmon = new Animal("Salmon Joffrey", Animal.Diet.VEGETARIAN);
        Mammal tiger = new Mammal("Tiger Sam", Animal.Diet.CARNIVORE, 0);
        Mammal motherTiger = new Mammal("Mother Tiger", Animal.Diet.CARNIVORE, 4);
        Human human = new Human("Human Jack", Animal.Diet.OMNIVORE, "Poles");
        Human motherHuman = new Human("Mother Human", Animal.Diet.OMNIVORE, "Poles");
        Reptile snake = new Reptile("Snake", Animal.Diet.CARNIVORE, 20);


        salmon.displayName();
        tiger.displayName();
        human.displayName();
        snake.displayName();//override

//        Drink mother milk is a Mammal method
        tiger.drinkMotherMilk(motherTiger);
        human.drinkMotherMilk(motherHuman);

//        speak is Human method
        human.speak();
        motherHuman.speak();
        System.out.println(motherHuman.amountOfUdders);

//        layEggs is a Reptile methods
        snake.layEggs();
        System.out.println(snake.name);
        snake.displayName();
    }
}
