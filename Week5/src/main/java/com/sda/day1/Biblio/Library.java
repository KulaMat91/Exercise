package com.sda.day1.Biblio;
// W klasie Biblioteka zawrzyj metodę getKsiazki,
// która będzie zwracała tablicę z obiektami typu Ksiazka, które przechowuje obiekt typu Biblioteka.

public class Library {
    private final Book[] books;
//Zwróćmy uwagę, że w konstruktorze klasy Library, oraz w getterze getBooks, tworzymy kopię tablicy
    public Library(Book[] books) {
        this.books = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            this.books[i] = books[i];
        }
    }

    //getter aby wydobyć listę ksiazek bo jest privet
    public Book[] getBooks() {
        Book[] books1 = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            books1[i] = books[i];
        }
        return books1;
    }

// bez kopi tablicy
//    public Library(Book[] books) {
//        this.books = books;
//    }
//    public Book[] getBooks() {
//        return books;
//    }

}
