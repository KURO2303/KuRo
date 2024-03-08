package com.mycompany.app.Week2.Week2Exercise.Polymorphism;

class First{
    public void A(){
        System.out.println("A");
        B();
    }
    public void B(){
        System.out.println("B");
    }
}
class Second extends First{
    public void B(){
        System.out.println("B'");
    }
}
public class Polymorphism_EX10 {
    public void econd() {
        First f = new Second();
        f.A(); 
    }
}