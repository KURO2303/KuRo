package com.mycompany.app.Week2_Code1;

public class Book {
    String title;
    String author;
    int numPages;
 Book() { } ; 
    public Book(String t, String a, int p) {
        title = t;
        author = a;
        numPages = p;
    }
    public static void main(String[] args) {
        Book DucBook = new Book("The Silence of the Lambs","Thomas Harris",195); 
        System.out.println(DucBook.title);
        System.out.println(DucBook.author);
        System.out.println(DucBook.numPages);
    }
    
}
