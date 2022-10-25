package org.exercise.EX1;

public class Triangle extends GeometricalFigures {
    private final double a;
    private final double b;
    private final double c;
    private final double h;
    Triangle(String name,double a, double b, double c, double h) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public void area() {

    }

    @Override
    public void perimeter() {

    }
}
