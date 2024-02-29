package com.mycompany.app.Week2;

public class book {
    String title;
    String author;
    int numPages;
    book() { } ; 
    public book(String t, String a, int p) {
    title = t;
    author = a;
    numPages = p;
    }
    public static void main(String[] args) {
        book myObj = new book("Harry Potter", "J. K. Rowling", 178); 
        System.out.println(myObj.title);
        System.out.println(myObj.author);
        System.out.println(myObj.numPages);
    }
   }