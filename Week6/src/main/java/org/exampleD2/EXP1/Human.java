package org.exampleD2.EXP1;
// klasy final - nie można z nich dziedziczyć
public final class Human extends Mammal{
    public Human(String name) {
        super(name);
    }
// nie można overridowac tej metody w klasie dziedziczącej, gdy uzyje ise final
    @Override
    public final void makeNoise() {
        System.out.println("Human speak");

    }
}
