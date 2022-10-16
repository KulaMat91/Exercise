package org.exercise.EX3;

import org.exercise.EX4.House;

//Zadanie 2: Liczba w opakowaniu
//        Zaimplementuj klasę, która zawiera liczbę, którą następnie można dowolnie przeliczać w sposób funkcyjny. Np:
//        System.out.println(new BoxedNumber(5).add(5).mul(2).mul(5).div(10)); // result: 10
//        Zaimplementuj dodawanie, odejmowanie, mnożenie, dzielenie, potęgowanie oraz możliwość podania własnej funkcji lambda
public class Main {
    public static void main(String[] args) {
        BoxedNumber boxedNumber = new BoxedNumber(5.0).add(5.0).mul(2.0).mul(5.0).div(10.0);
        System.out.println(boxedNumber);
    }

}
