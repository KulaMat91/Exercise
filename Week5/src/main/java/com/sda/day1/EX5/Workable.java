package com.sda.day1.EX5;

//Wszystkie metody w interfejse sa z defaltu są PUBLICZNE,   ABSTRAKCYJNE?
//Funkcyjne interfejsy mogą mieć jednąmetodę abstrkcyjną
//Interfejsy implementujemy
public interface Workable {
    // na szaro bo to jest defaltowe
    public static String interfaceName = "Workable";

    public boolean doWork();

    public default void printInterfaceName() {
        System.out.println(interfaceName);
    }

    static int getInt() {
        return 1;
    }

    private static long getLong() {

        return 1L;
    }

    private double getDouble() {
        return 1.0;
    }
}
