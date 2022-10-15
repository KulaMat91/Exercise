package org.exercise.EX1;
//Zadanie 1: Baza Danych Sklepu z Grami Komputerowymi
//Napisz program, który służy jako baza danych sklepu z grami komputerowymi. Każda gra komputera ma tytuł, gatunek, rok wydania i ilość sprzedanych egzemplarzy (w milionach).
//Program powinien wspierać przechowywanie danych w plikach CSV lub JSON.
//Program jest zaprojektowany w taki sposób, że łatwo można zaimplementować nowe formy przechowywania danych - warto tutaj użyć abstrakcji.
//Ponadto program powinien wspierać tzw kwerendy, czyli zapytania do bazy danych (każda kwerenda ma nazwę, typ zwrotny i swoją logikę).
//Wszystkie kwerendy oparte są o wspólny interfejs i są obsługiwane przez program uniwersalnie, dzięki czemu z łatwością można implementować kolejne.
//Przykładowe kwerendy:
//Jaki jest tytuł najlepiej sprzedającej się gry?
//Ile jest gier z gatunku Platformer?
//Która gra miała najgorszą sprzedaż w roku 2010?
//W akcji ma to wyglądać tak, że wpisuję nazwę kwerendy i jej parametr, i dostaję rezultaty, np:
//worst_sales_in_year 2010
//Call of Duty Black Ops
public class Main {
    public static void main(String[] args) {
        GameShop gameShop1 = new GameShop("GameShop1");
        VideoGame videoGame1 = new VideoGame("a", "b", 1991, 40L);
        gameShop1.addVideoGame(videoGame1);

    }
}
