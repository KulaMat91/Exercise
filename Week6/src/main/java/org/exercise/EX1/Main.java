package org.exercise.EX1;

//Zadanie 1: Figury
//Stwórz hierarchię klas reprezentującą figury geometryczne.
// Każda figura powinna mieć swoją nazwę oraz metody obliczające obwód oraz pole.
// Zaimplementuj figury: koło, trójkąt, trójkąt równoboczny, prostokąt, kwadrat.
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle", 22.4);
        circle1.area();
        circle1.circumference();
        circle1.perimeter();

        System.out.println();

        Square square1 = new Square("Square1", 5);
        square1.area();
        square1.perimeter();

        System.out.println();

        Rectangle rectangle1 = new Rectangle("Rectangle1", 4, 5);
        Rectangle rectangle2 = new Rectangle("Rectangle2", 2, 2);
        rectangle1.area();
        rectangle1.perimeter();
        rectangle2.area();
        rectangle2.perimeter();

        System.out.println();

        EquilateralTriangle equilateralTriangle1 = new EquilateralTriangle("Triangle 1", 2);
        equilateralTriangle1.area();
        equilateralTriangle1.perimeter();

    }
}
