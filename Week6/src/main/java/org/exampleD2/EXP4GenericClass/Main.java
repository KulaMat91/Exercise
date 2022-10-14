package org.exampleD2.EXP4GenericClass;


public class Main {

    public static void main(String[] args) {
        //      KLASY GENERYCZNE

        LockedBox<Integer, String> box = new LockedBox<>("zaq1", 42);

        System.out.println(box.getValue("zaq1"));

        LockedBox<String, Integer> stringBox = new LockedBox<>(400, "Secret string");
        System.out.println(stringBox.getValue(400));

        LockedBox<LockedBox<Integer, String>, String> boxception = new LockedBox<>("inception", box);
        System.out.println(boxception.getValue("inception").getValue("zaq1"));

        //float,double - typy nieprecyzyjne


//        //      METODY GENERYCZNE
//        ObjectSafe safe = new ObjectSafe();
//        Integer value = 123;
//        safe.setObject(value);
//
//

//////////////////////////////////////////////////////////////////////////////////////

        Cat cat = new Cat();
        AnimalCage<Cat> catCage = new AnimalCage<>();
//        AnimalCage<Integer> integerCage = new AnimalCage<Integer>(); //typ integer nie rozeszrza animal


    }
}
