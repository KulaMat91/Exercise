package com.sda.day1.EX3;
//Napisz klasę Box, które będzie przechowywać elementy dowolnego typu, np. int, String
//Na podstawie klasy Box stwórz obiekt oraz nową referencję do tego samego obiektu, zaprezentuj modyfikacje na dowolnej referencji.
//Napisz mechanizm, który stworzy nową niezależną kopię obiektu Box stworzonej w podpunkcie powyżej.
public class MainBox {
    public static void main(String[] args) {
        Box box1 = new Box("Blue", 50 , "Medium");
        Box box2 = new Box();
        System.out.println(box1);
        box2 = box1;
        System.out.println(box2);
        System.out.println(box1.equals(box2));
        box2.setColor("Pink");
        box2.setSize("Small");
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box1.equals(box2));

        Box box3 = new Box(box1);
        System.out.println(box3.equals(box1));
        System.out.println(box1.hashCode());
        System.out.println(box3.hashCode());

        box3.setSize("Big");
        System.out.println(box3);
        System.out.println(box1);
    }
}
