package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class A {
	A(int i){ 
        System.out.println("A("+i+")"); 
    }
}
class B {
	B(String j){
        System.out.println("B("+j+")");
    }
}

class C extends A {
	C(int i, String j){
		super(i);
        b = new B(j);
	}
    B b;
}
public class ReusingClasses_EX7 {
    public static void main(String[] args) {
		@SuppressWarnings("unused")
        C c = new C(0,"KURO");
	}
}
