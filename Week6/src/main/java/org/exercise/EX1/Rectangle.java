package org.exercise.EX1;

public class Rectangle extends Square {
    private double lenght;

    Rectangle(String name, double side, double lenght) {
        super(name, side);
        this.lenght = lenght;
    }

    @Override
    public void area() {
        double area = getSide() * lenght;
        System.out.println("The area of rectangle is: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = getSide() * 2 + lenght * 2;
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }

}
