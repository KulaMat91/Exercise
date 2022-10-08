package org.example.EXP4;

//STATIC/ NON-STATIC
public class Main {
    public static void main(String[] args) {

        System.out.println(Car.carsProduced);
        System.out.println("Size " + Car.allCarsProduced.size());

        Car car1 = new Car("Ford", "Mustang", 2022);

        System.out.println(Car.carsProduced);
        System.out.println("Size " + Car.allCarsProduced.size());


        Car car2 = new Car("Passat", "Volkswagen", 2000);
        System.out.println(Car.carsProduced);
        System.out.println("Size " + Car.allCarsProduced.size());

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();

        Car.printAllCars();


    }

}
