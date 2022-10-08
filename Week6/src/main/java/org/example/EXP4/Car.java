package org.example.EXP4;

import java.util.ArrayList;
import java.util.List;

public class Car {
    //    STATIC
    public static List<Car> allCarsProduced = new ArrayList<>();
    public static int carsProduced = 0;
    //NON-STATIC
    public String model;
    //    public static String model; - JEZELI JEST STATYCZNE TO JEST UNIKALNE DLA CAŁEJ KLASY I WTEDY MOZE BYC TYLKO JEDNA WARTOSC !!!
    public String mark;
    public int yearProduce;

    public Car(String model, String mark, int yearProduce) {
        this.model = model;
        this.mark = mark;
        this.yearProduce = yearProduce;
        carsProduced++;

        allCarsProduced.add(this);
    }

    public static void printAllCars() {
        for (Car car : allCarsProduced) {
            System.out.println(car);
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s, produce in %d.", mark, model, yearProduce);
    }
}
