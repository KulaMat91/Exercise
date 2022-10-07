package com.sda.day1.Biblio;
//Napisz niemutowalną klasę Ksiazka z polami tytul, autor, oraz cena, oraz metodą toString.
// Następnie, napisz niemutowalną klasę Biblioteka, która będzie zawierała tablicę obiektów typu Ksiazka.
// W klasie Biblioteka zawrzyj metodę getKsiazki,
// która będzie zwracała tablicę z obiektami typu Ksiazka, które przechowuje obiekt typu Biblioteka.
public class Book {
    private final String title;
    private final String author;
    private final double price;

    Book(String title, String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book: "+ title +
                ", author: " + author +
                ", price: " + price + ".";
    }

    public double getPrice() {
        return price;
    }
}
