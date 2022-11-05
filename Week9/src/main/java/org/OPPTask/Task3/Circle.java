package org.OPPTask.Task3;

public class Circle extends Shape {

    private Double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(String color, Boolean isFilled, Double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return  (Math.PI * radius * radius);
    }

    @Override
    public Double getPerimeter() {
        return  (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return String.format("Circle with radius %f which is subclass off %s", radius, super.toString());
    }
}
