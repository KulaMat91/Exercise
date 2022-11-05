package org.OPPTask.Task3;

public abstract class Shape {
    protected String color;
    protected Boolean isFilled;

    Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, Boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public Boolean getFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        isFilled = filled;
    }
    public abstract Double getArea();
    public abstract Double getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s", color, isFilled ? "filled" : "NotFilled");
    }
}
