package se.lexicon.zainabahmed.books;
import java.util.Arrays;

//OOP EXERCISE 3.
//Each book has only one author
//Each author can write multiple books

public class Book {
    private int bookID;
    private String bookTitle;
    private String authorFirstName;
    private String authorSurName;
    private String publicationDate;
    private String ISBN;
    private String language;
    private String genre;

    private static int countBooks;
    private static Book[] booksArray = new Book[] {};

    //constructors
    //no arg constructor
    public Book () {

    }
    //all values constructor
    public Book (String bookTitle, String authorFirstName, String AuthorSurName, String genre,
                 String publicationDate, String ISBN, String Language) {

    }
    //title, author full name constructor
    public Book (String bookTitle, String authorFirstName, String AuthorSurName) {

    }
    //title, author full name, genre constructor
    public Book (String bookTitle, String authorFirstName, String AuthorSurName, String genre) {

    }
    //title, author last name constructor
    public Book (String bookTitle, String AuthorSurName) {

    }
    //title constructor
    public Book (String bookTitle) {

    }
    //getters and setters

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorSurName() {
        return authorSurName;
    }

    public void setAuthorSurName(String authorSurName) {
        this.authorSurName = authorSurName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static int getCountBooks() {
        return countBooks;
    }

    public static void setCountBooks(int countBooks) {
        Book.countBooks = countBooks;
    }

    public static Book[] getBooksArray() {
        return booksArray;
    }

    public static void setBooksArray(Book[] booksArray) {
        Book.booksArray = booksArray;
    }
    //toString()
    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorSurName='" + authorSurName + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", language='" + language + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    //main
    public static void main(String[] args) {

    Book heartOfDarkness = new Book("Heart of Darkness","Joseph","Conrad");
    Book potterPhoenix = new Book("Harry Potter and the Order of the Phoenix", "Rowling");
    Book thankYouJeeves = new Book("Thank you, Jeeves","P.G.","Wodehouse");
    Book deepWork = new Book("Deep Work","Cal","Newport");
    Book getItDone = new Book("Get It Done!","David","Allen","Productivity");
    booksArray = new Book[] {heartOfDarkness, potterPhoenix, thankYouJeeves, deepWork, getItDone};
    setBooksArray(booksArray);

        System.out.println(heartOfDarkness);
    }
    //methods
public static void createBooks(){
    Book heartOfDarkness = new Book("Heart of Darkness","Joseph","Conrad");
    Book potterPhoenix = new Book("Harry Potter and the Order of the Phoenix", "Rowling");
    Book thankYouJeeves = new Book("Thank you, Jeeves","P.G.","Wodehouse");
    Book deepWork = new Book("Deep Work","Cal","Newport");
    Book getItDone = new Book("Get It Done!","David","Allen","Productivity");
}
    public static void findBookAuthor(){   //

    }
}
