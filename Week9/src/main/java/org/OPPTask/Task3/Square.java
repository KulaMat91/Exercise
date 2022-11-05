package org.OPPTask.Task3;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(String color, Boolean isFilled, Double size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setWidth(Double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(Double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return String.format("Square with width = %f and and length= %f which is subclass off %s", getWidth(), getLength(), super.toString());
    }


}
