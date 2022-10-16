package org.exercise.EX4;
//Zadanie 3: Budowanie domu
//        Zaimplementuj klasę dom, która zawiera dużo fieldów (wymiary, ilość drzwi, ilość okien, kolor ścian, grubość izolacji,
//        kolor dachu, etc) i można ją konstruować w sposób funkcyjny:
//        House house = new House().addDoors(4).addWindows(10).setWallsColor("white");
//        PRO TIP: immutability nie jest koniecznie do osiągnięcia funkcyjności.
//        Możecie też zwracać tą samą instancję klasy, na której wykonujecie metodę. Da się to osiągnąć w taki sposób:
//public House setWallsColor(String color) {
//        this.color = color;
//        return this;
//        }
public class Main {
    public static void main(String[] args) {
        House house = new House().addDoors(4).addWindows(10).setWallsColor("white");
        System.out.println(house);
    }

}
