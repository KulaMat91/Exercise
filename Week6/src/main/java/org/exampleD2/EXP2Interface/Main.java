package org.exampleD2.EXP2Interface;


public class Main {
    public static void main(String[] args) {
//  Each Human is an Animal and thus can be perceived as such.
//  Not every Animal is a Human and thus cannot be perceived as such.

        Animal animalAsAnimal = new Animal();
//Human animalAsHuman = (Human) animalAsAnimal; won't work, not every animal is a human

// Actual type - Human; Perceived type - Human
        Human humanAsHuman = new Human();

// Actual type - Human; Perceived type - Animal
        Animal humanAsAnimal = humanAsHuman; // new Human()

        humanAsHuman = (Human) humanAsAnimal; // Will work, because actual type is Human, only perceived type was changed to Animal

//Polimorfizm Klasy
//        Human actual objects type
//        Animal - postrzegany typ obiektu
        Animal humanAsAnimal2 = new Human();

//      Actual type Human, perceived type Animal
        Human humanAsHuman2 = new Human();

        Animal cat = new Cat();
        Animal dog = new Dog();
//        Aktualny typ dyktuje nam logikę
//        Postrzegany typ dyktuje nam możliwosći (metody, pola)

        dog.eat();
        cat.eat();
        humanAsHuman2.eat(); // wykona nadpisaną metodę z Human
        humanAsAnimal2.eat();


//        humanAsAnimal2.goToWork(); // nie mozna korzystac z metod zdefiniowanych poza klasa głowną
        humanAsHuman2.goToWork();

        dog.sleep();
        cat.sleep();
        humanAsHuman2.sleep();
        humanAsAnimal2.sleep();
        System.out.println();

//Polimorfizm Interfejsy
        AlarmSiren alarmSiren = new AlarmSiren();
        Car car = new Car();
        Speaker speaker = new Speaker();

        SoundInterface sirenInterface = new AlarmSiren();
        SoundInterface carInterface = car;
        SoundInterface speakerInterface = speaker;

        sirenInterface.makeSound();
        carInterface.makeSound();
        speakerInterface.makeSound();


        alarmSiren.makeSound();
        car.makeSound();
        speaker.makeSound();


    }
}
