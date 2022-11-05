package org.Exeptions.Task1;

public class Main {
    public static void main(String[] args) {

    }

    public double divide(Double a, Double b) throws CannotDivide {
        if (b == 0) {
            throw new CannotDivide("You cannot divide by 0!");
        } else {
            return a / b;
        }
    }
}
