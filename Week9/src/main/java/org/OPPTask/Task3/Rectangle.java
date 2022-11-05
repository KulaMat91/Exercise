package org.OPPTask.Task3;

public class Rectangle extends Shape {
    private Double width;
    private Double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(String color, Boolean isFilled, Double width, Double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public Double getLength() {
        return length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }


    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public Double getArea() {
        return width * length;
    }

    @Override
    public Double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width = %f and and length= %f which is subclass off %s", width, length, super.toString());
    }

}
