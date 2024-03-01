package com.mycompany.app.Week2.Week2ClassPractice;

public class App {
    public static void main(String[] args) {
        book b = new book("Harry Potter", "J. K. Rowling", 178); 
        System.out.println(b.title);
        System.out.println(b.author);
        System.out.println(b.numPages);

        time t = new time();
            t.setHour(6);
            t.setMinute(43);
            t.setSecond(13);
            System.out.println(t.toString());

        Recursion r = new Recursion();
            System.out.println(r.factorial(5));
    }
}
