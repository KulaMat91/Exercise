package org.example.EXP5;

//Encapsulaton / Hermetisation
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Mustang", 2022);
        System.out.println(car1.getModel());
        Car car2 = new Car("Passat", "Volkswagen", 2000);
        car2.setMark("GOLF");


    }
}
