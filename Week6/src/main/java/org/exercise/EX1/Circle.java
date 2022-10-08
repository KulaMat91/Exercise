package org.exercise.EX1;

public class Circle extends GeometricalFigures {

    private double diameter;

    Circle(String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }

    public void area() {
        double area = Math.PI * Math.pow(0.5 * diameter, 2);
        System.out.println("The area of circle is: " + area);
    }

    public void circumference() {
        double area = 2 * Math.PI * 0.5 * diameter;
        System.out.println("Circumference of the circle is: " + area);
    }

}
