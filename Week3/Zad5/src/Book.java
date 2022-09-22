public class Book {
//    Stwórz klasę Book, o polach: author, title, numberOfPages, releaseDate,
//isBorrowed. Następnie stwórz klasę Library, która zawierać będzie listę
//typu Book, oraz metodę umożliwiającą wypożyczanie, oddawanie książek.

    private String author;
    private String title;
    private int numberOfPage;
    private String releaseDate;
    private String isBorrowed;

    public Book(String author, String title, int numberOfPage, String releaseDate){
        this.author = author;
        this.title = title;
        this.numberOfPage = numberOfPage;
        this.releaseDate = releaseDate;
    }

}
