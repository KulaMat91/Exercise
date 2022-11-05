package org.Exeptions.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public Boolean addBook(Book book) {
        this.addBook(book);
        return true;
    }

    public Boolean removeBook(Book book) {
        if (books.contains(book)) {

            this.removeBook(book);
            return true;
        }
        return false;
    }

    public Book findBookByTittle(String title) throws NoBookFoundExceptions{
        Optional<Book> searchBook =  books.stream().filter(book -> book.getTitle().equals(title)).findFirst();
        if (searchBook.isEmpty()){
            throw new NoBookFoundExceptions(title);
        }
        return searchBook.get();
    }

    public Book findBookById(Integer id) throws NoBookFoundExceptions{
        Optional<Book> searchBook = books.stream().filter(book -> book.getIsbn().equals(id)).findFirst();
        if (searchBook.isEmpty()){
            throw new NoBookFoundExceptions(String.valueOf(id));
        }
        return searchBook.get();
    }

    public Boolean removeBookById(Integer id) throws NoBookFoundExceptions{
        return this.books.remove(findBookById(id));
    }

}
