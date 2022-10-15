package org.exampleD1.EXP3Polymorphis;

public class Example {
    public static void example() {
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Garfield");

        dog.sleep();
        cat.sleep();
        dog.makeNoise();
        cat.makeNoise();

        dog.apport();
//        cat.apport();

//        dog.lickFur();
        cat.lickFur();

//        Upcasting - cast an object to a type higher in the hierarchy
        Animal animalDog = dog;
        Animal animalCat = cat;

        animalCat.sleep();
        animalDog.sleep();
//        animalDog.apport();
//        animalCat.lickFur();

        animalDog.makeNoise();//HAU
        animalCat.makeNoise();//MIAU

//        When a dog is percieved as an Animal we dont know that he can apport
//        animalDog.apport();

//        Downcasting - cast an object to a type lower in type hierarchy
        Dog downcastedDog = (Dog) animalDog;
        Cat downcastedCat = (Cat) animalCat;

        downcastedDog.apport();
        downcastedCat.lickFur();

        try {
            Dog catThatWantToBeADog = (Dog) animalCat;
            Cat dogThatWantToBeACat = (Cat) animalDog;
        }
        catch (ClassCastException e){
            System.out.println("You cant changes animal species");
        }

        System.out.println("/////////////////////////////////////////////////////////////");

        // instanceof - stosowac jak narzadziej
        apportIfDog(animalDog);
        apportIfDog(animalCat);

    }

    private static void  apportIfDog(Animal animal){
        if (animal instanceof Dog){
            Dog saflelyDowcastedDog = (Dog) animal;
            saflelyDowcastedDog.apport();
        }
        else {
            System.out.println("Given Animal is not a dog!");
        }
    }
}
