package org.example.EXP5;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public static List<Car> allCarsProduced = new ArrayList<>();
    public static int carsProduced = 0;
    private String model;
    private String mark;
    private int yearProduce;

    public Car(String model, String mark, int yearProduce) {
        this.model = model;
        this.mark = mark;
        this.yearProduce = yearProduce;
        carsProduced++;

        allCarsProduced.add(this);
    }

//    ENKAPSULACJA
    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model= model;
    }

    public void setMark(String mark) {
        this.mark = mark;
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
