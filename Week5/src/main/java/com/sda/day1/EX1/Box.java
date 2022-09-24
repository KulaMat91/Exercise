package com.sda.day1.EX1;
//Napisz klasę Box, które będzie przechowywać elementy dowolnego typu, np. int, String

public class Box {

    private String color;
    private String size;
    private int height;

    public Box(String color, String size, int height){
        this.color = color;
        this.size = size;
        this. height = height;

    }

    public String toString(){
        return "Color: " + color + "\nSize: " + size + "\nHeight: " + height;
    }

}
