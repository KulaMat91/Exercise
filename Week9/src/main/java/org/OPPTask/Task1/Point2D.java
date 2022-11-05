package org.OPPTask.Task1;

public class Point2D {
    public Double x;
    public Double y;

    Point2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point2D(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double[] getXY() {
        return new Double[]{x, y};
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setYX(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";

    }
}
