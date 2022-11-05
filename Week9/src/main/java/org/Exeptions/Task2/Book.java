package org.Exeptions.Task2;

public class Book {
    private Integer isbn;
    private String title;
    private String author;
    private Integer releaseDate;

    public Book(Integer isbn, String title, String author, Integer releaseDate) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }
}
