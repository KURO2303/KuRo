package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class A1 {
	A1(int i){ 
        System.out.println("A("+i+")"); 
    }
}
class B2 {
	B2(String j){
        System.out.println("B("+j+")");
    }
}

class C3 extends A1 {
	C3(int i, String j){
		super(i);
        b = new B2(j);
	}
    B2 b;
}
public class ReusingClasses_EX7 {
    public static void main(String[] args) {
		@SuppressWarnings("unused")
        C3 c = new C3(0,"KURO");
	}
}
