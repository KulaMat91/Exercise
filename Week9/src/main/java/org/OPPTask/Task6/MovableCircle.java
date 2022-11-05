package org.OPPTask.Task6;

public class MovableCircle implements MovableInterface {
    public MovablePoint circleCenter;

    public int r;

    public MovableCircle(MovablePoint circleCenter, int r) {
        this.circleCenter = circleCenter;
        this.r = r;
    }

    @Override
    public void moveUp() {
        circleCenter.y += circleCenter.ySpeed;
    }

    @Override
    public void moveDown() {
        circleCenter.y -= circleCenter.ySpeed;

    }

    @Override
    public void moveLeft() {
        circleCenter.x -= circleCenter.xSpeed;

    }

    @Override
    public void moveRight() {
        circleCenter.x += circleCenter.xSpeed;

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "circleCenter=" + circleCenter +
                ", r=" + r +
                '}';
    }
}
