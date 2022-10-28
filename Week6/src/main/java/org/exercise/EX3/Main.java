package org.exercise.EX3;
//Zadanie 3: Pojazdy
//Stwórz hierarchię klas reprezentującą różne typy pojazdów. Każdy pojazd ma nazwę, typ napędu oraz ilość pasażerów, którzy mogą wsiąść.
//Zaimplementuj następujące typy pojazdów: rower (zawsze napęd manualny i zawsze 1 miejsce), samochód (napęd benzynowy, diesel lub elektryczny),
//pociąg (napęd elektryczny, może mieć wagony, które też są rozpoznawane jako pojazdy, ale z napędem manualnym - są ciągnięte przez lokomotywę) oraz samolot (napęd odrzutowy).
//Każdy pojazd ma metodę do tankowania, w której należy podać typ paliwa - jeżeli typ paliwa nie pasuje do danego pojazdu, należy wyświetlić komunikat.
// Jest też metoda dodawania/usuwania pasażerów (tutaj należy przestrzegać limitu).
public class Main {
    public static void main(String[] args) {

        Bike bike = new Bike("Unibike");
        System.out.println(bike.driveType);
        System.out.println(bike.numberOfPassenger);

        Car car = new Car("Opel", Fuel.DISEL,4);
        car.tank(Fuel.DISEL);
        car.addPassenger();
        car.addPassenger();
        System.out.println(car.numberOfPassenger);
        System.out.println(car.name);
        System.out.println(car);

        Train train = new Train("IC");
        System.out.println(train.name);

    }
}
