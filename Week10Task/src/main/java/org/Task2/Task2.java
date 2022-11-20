package org.Task2;

import java.sql.Array;
import java.util.Scanner;

/*
Napisz program, który odbiera rozmiar tablicy (n) od użytkownika (System.in). Następnie
odbierz n liczb od użytkownika i umieść je w tablicy. Zaimplementuj algorytm
sortowania bąbelkowego, aby posortować tę tablicę w porządku rosnącym.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write size od the Array: ");
        Integer sizeArray = scanner.nextInt();
        System.out.println("Array size : " + sizeArray);
        Integer[] table = new Integer[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            System.out.printf("Add number to the table(%d number left):\n", sizeArray - i);
            Integer a = scanner.nextInt();
            table[i] = a;
        }
        Integer temp;

        for (int i = 0; i < sizeArray - 1; i++) {
            for (int j = 0; j < sizeArray - i - 1; j++) {
                if (table[j] > table[j + 1]) {
                    temp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = temp;
                }
            }
        }

        for (Integer integer : table) {
            System.out.print(integer + ", ");
        }
    }
}
