package org.OPPTask.Task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(10, 20, 5, 11);
        MovableCircle circle1 = new MovableCircle(point1, 5);
        point1.moveDown();
        point1.moveLeft();
        System.out.println(point1);
        System.out.println(circle1);

        List<MovableInterface> movables = new ArrayList<>();

        movables.add(point1);
        movables.add(circle1);

    }
}
