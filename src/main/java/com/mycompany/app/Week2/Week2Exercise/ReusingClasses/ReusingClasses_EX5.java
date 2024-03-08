package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class A {
	A(){ 
        System.out.println("A"); 
    }
}
class B {
	B(){ 
        System.out.println("B"); 
    }
}
class C extends A {
	B b = new B();
}
public class ReusingClasses_EX5 {
    public static void main(String[] args) {
		@SuppressWarnings("unused")
        C c = new C();
}
}
