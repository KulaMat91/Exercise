package org.example.EXP1;
//typ enumeratywny
//enumerative type/enum
//
public class Main {
    public enum Color {
        BLACK(5,"WHITE"),
        WHITE(4,"BLACK"),
        RED(3,"BLUE"),
        BLUE(2,"GREEN"),
        GREEN(1,"RED");

        public int value;
        public String oppositColor;
        Color(int value, String oppositColor){
            this.value = value;
            this.oppositColor= oppositColor;
        }
    }

    public static void main(String[] args) {
        Color carColor = Color.BLUE;
        if (carColor == Color.BLUE) {
            System.out.println("My car is blue!");
        }
// jest ukrytym integerem
        Integer numberValue = (int) carColor.ordinal();
        System.out.println(numberValue);
        System.out.println(carColor.oppositColor);
    }
}
