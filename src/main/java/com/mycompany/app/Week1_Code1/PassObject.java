package com.mycompany.app.Week1_Code1;

public class PassObject {
    static void f(Number m) {
    m.i = 15;
    }
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        Number n = new Number();
        n1.i = 2;
        n2.i = 5;
        n1 = n2;
        n2.i = 10;	
        System.out.println(n1.i);
        n1.i = 20;	
        System.out.println(n2.i);
        n.i = 14;
        f(n);
        System.out.println(n.i);
    }
}