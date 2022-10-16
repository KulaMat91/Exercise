package org.exercise.EX3;

public class BoxedNumber implements CalculateFunction{
    private final Double a;

    public Double getNumber() {
        return this.a;
    }

    public BoxedNumber(Double number) {
        this.a = number;
    }

    public BoxedNumber add(Double num) {
        return new BoxedNumber(this.a + num);
    }

    public BoxedNumber sub(Double num) {
        return new BoxedNumber(this.a - num);
    }

    public BoxedNumber mul(Double num) {
        return new BoxedNumber(this.a * num);
    }

    public BoxedNumber div(Double num) {
        return new BoxedNumber(this.a / num);
    }

    public String toString() {
        return this.a.toString();
    }
}
