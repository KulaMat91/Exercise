package org.OPPTask.Task5;

import org.OPPTask.Task1.Point2D;

public class Line {
    private Point2D a;
    private Point2D b;

    public Line(Point2D a, Point2D b) {
        this.a = a;
        this.b = b;
    }

    public Line(Double aX, Double aY, Double bX, Double bY) {
        this.a = new Point2D(aX, aY);
        this.b = new Point2D(bX, bY);
    }

    public Point2D getA() {
        return a;
    }

    public Point2D getB() {
        return b;
    }

    public void setA(Point2D a) {
        this.a = a;
    }

    public void setB(Point2D b) {
        this.b = b;
    }

    public Double getLength() {
        return  Math.sqrt(Math.pow((a.getX() - b.getX()),2) + Math.pow((a.getY()) - b.getY(),2));
    }

    public Point2D getCenter(){
        return new Point2D((a.getX() + b.getX())/2,(a.getY() + b.getY())/2);
    }
}
