package org.Task1;

import java.util.Scanner;

/*
Odwróć liczbę za pomocą pętliwhile .
Program poprosi użytkownika o wprowadzenie numeru, a następnie odwróci liczbę za
pomocą pętli while
 */
public class ReversNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Boolean looper = true;
        while (looper) {
            System.out.println("Input your number(exit input 0):");
            double number = scanner.nextDouble();
            if (number == 0){
                looper =false;
                continue;
            }
            System.out.println("Revers number: " + (1/number));
        }
    }
}
