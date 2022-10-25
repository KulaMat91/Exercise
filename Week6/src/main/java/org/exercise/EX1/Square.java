package org.exercise.EX1;

public class Square extends GeometricalFigures {
    private double side;

    Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    @Override
    public void area() {
        double area = side * side;
        System.out.println("The area of square is: " + area);
    }
    @Override
    public void perimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of the square is: " + perimeter);
    }
}
