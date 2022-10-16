package org.exercise.EX4;
//Zadanie 2: Liczba w opakowaniu
//        Zaimplementuj klasę, która zawiera liczbę, którą następnie można dowolnie przeliczać w sposób funkcyjny. Np:
//        System.out.println(new BoxedNumber(5).add(5).mul(2).mul(5).div(10)); // result: 10
//        Zaimplementuj dodawanie, odejmowanie, mnożenie, dzielenie, potęgowanie oraz możliwość podania własnej funkcji lambda
public class House {
    private Integer width;
    private Integer depht;
    private Integer height;
    private Integer numberOfWindows;
    private Integer numberOfDoors;
    private Integer thicknessOfIsolation;
    private String wallsColor;
    private String roofColor;

    public House() {
    }

    public House(Integer width, Integer depht, Integer height, Integer numberOfWindows, Integer numberOfDoors, Integer thicknessOfIsolation, String wallsColor, String roofColor) {
        this.width = width;
        this.depht = depht;
        this.height = height;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.thicknessOfIsolation = thicknessOfIsolation;
        this.wallsColor = wallsColor;
        this.roofColor = roofColor;
    }

    public House setWallsColor(String wallsColor){
        this.wallsColor = wallsColor;
        return this;
    }

    public House addDoors(Integer numberOfDoors){
        this.numberOfDoors = numberOfDoors;
        return this;
    }
    public House addWindows(Integer numberOfWindows){
        this.numberOfWindows = numberOfWindows;
        return this;
    }



    @Override
    public String toString(){
        return String.format("Number of Door: %d \nNumber of windows: %d \nWall color: %s", numberOfDoors,numberOfWindows,wallsColor);
    }

}
