package se.lexicon.zainabahmed.books;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Author {
//OOP EXERCISE 3.
//Each book has only one author
//Each author can write multiple books

    private int authorID;
    private String foreName;
    private String surName;
    private String genre;
    private int booksWritten;
    private Book [] publicationList;

    private static String [] authorsArray;
    private static int countAuthors;

    //constructors
    //no arg constructor
    public Author(){

    }
    //name genre constructor
    public Author(String foreName, String surName, String genre){

    }
    //name constructor
    public Author(String foreName, String surName){

    }
    //most parameters (not list of books written) constructor
    public Author(String foreName, String surName, String genre, int booksWritten) {
        this.foreName = foreName;
        this.surName = surName;
        this.genre = genre;
        this.booksWritten = booksWritten;

    }
    //all parameters constructor, including list of publications
    public Author(String foreName, String surName, String genre, int booksWritten, String[] publicationList) {
        this.foreName = foreName;
        this.surName = surName;
        this.genre = genre;
        this.booksWritten = booksWritten;

    }
    //getters and setters

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(int booksWritten) {
        this.booksWritten = booksWritten;
    }


    public Book[] getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(Book[] publicationList) {
        this.publicationList = publicationList;
    }

    public static int getCountAuthors() {
        return countAuthors;
    }

    public static void setCountAuthors(int countAuthors) {
        Author.countAuthors = countAuthors;
    }
    //toString
    @Override
    public String toString() {
        return "Author{" +
                "authorID=" + authorID +
                ", foreName='" + foreName + '\'' +
                ", surName='" + surName + '\'' +
                ", genre='" + genre + '\'' +
                ", booksWritten=" + booksWritten +
                ", publicationList=" + Arrays.toString(publicationList) +
                '}';
    }

    //main
    public static void main(String[] args) {
        // passed to constructor, but getter returns null? returns value when set with setter ??
        Author enidBlyton = new Author("Enid", "Blyton", "children's fiction" );
        Author sidneySheldon = new Author("Sidney", "Sheldon", "Fiction" );
        Author jkRowling = new Author("Joanne","Rowling");
        Author calNewPort = new Author("Cal","Newport","Productivity");
        Author tonyRobbins = new Author("Tony","Robbins","Success");
        Author danielLiang = new Author("Daniel","Liang","Java");
        Author josephConrad = new Author("Joseph","Conrad");
//        enidBlyton.setAuthorID(1);
//        enidBlyton.setForeName("Enid");
//        //enidBlyton.setSurName("Blyton");
//      //  System.out.println(enidBlyton.toString());
//        System.out.println(enidBlyton.foreName);
//       // System.out.println(enidBlyton.surName);
//        System.out.println(enidBlyton.getForeName());
//        System.out.println(sidneySheldon.getSurName());
//        System.out.println(sidneySheldon.surName);
    }


    //methods
public static void booksByAuthor(){   // will return a list

}
}
