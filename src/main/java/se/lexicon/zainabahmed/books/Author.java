package se.lexicon.zainabahmed.books;

public class Author {
    private int authorID;
    private String foreName;
    private String surName;
    private String genre;
    private int booksWritten;
    private String [] publicationList;
    private static String [] authorsArray;
    private static int countAuthors;

    //constructors
    public Author(String foreName, String surName, String genre, int booksWritten, String[] publicationList) {
        this.foreName = foreName;
        this.surName = surName;
        this.genre = genre;
        this.booksWritten = booksWritten;
        this.publicationList = publicationList;
    }
    //getters and setters

    //main
    public static void main(String[] args) {

    }
    //methods
public static void booksByAuthor(){   // will return a list

}
}
