package org.OPPTask.Task7;

public class Circle implements GeometricObject {
    public double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
