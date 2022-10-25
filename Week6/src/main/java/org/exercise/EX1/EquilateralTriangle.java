package org.exercise.EX1;

public class EquilateralTriangle extends Square {

    EquilateralTriangle(String name, double side) {
        super(name, side);
    }


    public void area() {
        double area = (getSide() * Math.sqrt(3))/4;
        System.out.printf("The area of triangle is: %f\n", area);
    }

    public void perimeter() {
        double perimeter = getSide()*3;
        System.out.println("Perimeter of the triangle is: " + perimeter);
    }

}
