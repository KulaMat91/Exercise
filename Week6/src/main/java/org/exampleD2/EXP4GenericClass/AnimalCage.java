package org.exampleD2.EXP4GenericClass;

// klasa generyczna jedyne typy ktore sa Animalem i dziedzicza z Animala
public class AnimalCage<T extends Animal> {
    private T animal;

    public void feedAnimal() {
        animal.feed();
//        Animal animalAsAnimal = animal;
//        animalAsAnimal.feed();
    }
}
