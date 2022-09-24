package com.sda.day1.EX3;


import java.util.Objects;

public class Box {
    private String color;
    private int weight;
    private String size;

    public Box() {
    }

    public Box(String color, int weight, String size) {
        this.color = color;
        this.weight = weight;
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String getSize() {
        return size;
    }
// kopiowanie własciwiosć boxa do nowego boxa
    public Box(Box box){
        this.color = box.getColor();
        this.size = box.getSize();
        this.weight = box.getWeight();
    }

    @Override
    public String toString() {
        return "[Color: " + color +
                ". Weight: " + weight +
                ". Size: " + size + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return weight == box.weight && Objects.equals(color, box.color) && Objects.equals(size, box.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, size);
    }
}


