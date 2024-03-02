package com.mycompany.app.Week1;

public class NewF {
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
        n2.i = 10;	// what is n1.i?
        System.out.println(n1.i);//10
        n1.i = 20;	// what is n2.i?
        System.out.println(n2.i);//20
        n.i = 14;
        f(n);//// what is n.i now?
        System.out.println(n.i);//15
    }
}
