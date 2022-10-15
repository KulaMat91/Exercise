package org.exampleD1.EXP5;

//Immutability, Mutability
public class Main {
    public static void main(String[] args) {

        //String sa immutable - nie da sie go zmienic nie tworzyć nowego stringa
        //Tak samo tablice maja stły rozmiar

        ImmutableEmployee immutable = new ImmutableEmployee(1, "Mat", "Nowak", "CEO", new ImmutableEmployee[]{
                new ImmutableEmployee(1, "X", "y", "Z", null),
                new ImmutableEmployee(1, "a", "b", "c", null),
                new ImmutableEmployee(1, "u", "i", "p", null),
        });
//        immutable = new ImmutableEmployee(1,"Mateusz", "Nowak", "CEO");

        // mozna cos zmienic za pomoca tablicy
        ImmutableEmployee[] teammates = immutable.getTeammates();
        teammates[0] = immutable;

        for (ImmutableEmployee e: immutable.getTeammates()) {
            System.out.printf("%s %s %S\n", e.getFirstName(), e.getSecondName(), e.getRole());
        }
        System.out.println();

        for (ImmutableEmployee e: teammates) {
            System.out.printf("%s %s %S\n", e.getFirstName(), e.getSecondName(), e.getRole());
        }
    }
}
