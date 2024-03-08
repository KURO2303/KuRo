package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class kuro1{
	kuro1(int i){ 
        System.out.println("KURO("+i+")"); 
    }
}
class kuro2 extends kuro1{
	kuro2(){
		super(0);
		System.out.println("KURO()");
    }
	kuro2(int i){
		super(i);
		System.out.println("KURO("+i+")"); 
    }
}
public class ReusingClasses_EX8 {
    public static void main(String[] args) {
		@SuppressWarnings("unused")
        kuro2 A = new kuro2();
		@SuppressWarnings("unused")
        kuro2 B = new kuro2(128);
	}
}
