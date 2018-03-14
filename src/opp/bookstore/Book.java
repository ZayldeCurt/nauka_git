package opp.bookstore;

public class Book {

    private String title;
    private Author author;
    private int ReleaseYear;

    public int getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        ReleaseYear = releaseYear;
    }

    public String getTitle() {
//        return title;
        return title != null ? title : "blad";

    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public Book(){

    }
    public Book(String title) {
        this.title = title;
    }

    public Book(String title, Author author, int releaseYear) {
        this.title = title;
        this.author = author;
        ReleaseYear = releaseYear;
    }

    public Book(String title, int releaseYear) {
        this.title = title;
        ReleaseYear = releaseYear;
    }

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", ReleaseYear=" + ReleaseYear +
                '}';
    }
}
