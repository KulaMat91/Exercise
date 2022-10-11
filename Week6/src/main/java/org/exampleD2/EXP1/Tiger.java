package org.exampleD2.EXP1;

public class Tiger extends Mammal {

    public Tiger(String name) {
        super(name);
    }

    // w klasach nieabstrkacyjnych trzeba nadpisac metode abstrkacyjna
    @Override
    public void makeNoise() {

    }
}
