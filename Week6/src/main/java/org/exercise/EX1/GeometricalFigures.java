package org.exercise.EX1;

import org.example.EXP5other.D;

public abstract class GeometricalFigures {
    private String name;

    GeometricalFigures(String name){
        this.name = name;
    }

    public abstract void area();
    public abstract void perimeter();
}
