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
        book myObj = new book("a", "b", 2); 
        System.out.println(myObj.title);
    }
   }