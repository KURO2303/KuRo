package com.mycompany.app.Week2.Week2ClassPractice;

public class App {
    public static void main(String[] args) {
        book myObj = new book();
        myObj.an();

        time temp = new time();
        temp.SetHour(6);
        temp.SetMinute(43);
        temp.SetSecond(13);
        System.out.println(temp.print());


        recursion r = new recursion();
        System.out.println(r.factorial(5));
}
}