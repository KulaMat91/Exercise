package com.sda.day1.Biblio;

public class Main {
    public static void main(String[] args) {
        Book[] library = {
                new Book("Roland", "Stephen King", 39.99),
                new Book("Powolanie trojki", "Stephen King", 39.99),
                new Book("Wilki z Calla", "Stephen King", 49.99),
                new Book("1985", "George Orwell", 11.99)};

        Book book = new Book("1985", "George Orwell", 11.90);
        System.out.println(book);

        System.out.println();

        Library library1 = new Library(library);
        System.out.println("Books in library:");
        for (Book element: library1.getBooks()) {
            System.out.println(element);
        }
    }
}
