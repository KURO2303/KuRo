package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class kuroA{
	kuroA(int i){ 
        System.out.println("KURO("+i+")"); 
    }
}
class  kuroB extends kuroA{
	kuroB(){
		super(0);
		System.out.println("KURO()");
    }
	kuroB(int i){
		super(i);
		System.out.println("KURO("+i+")"); 
    }
}
public class ReusingClasses_EX8 {
    public static void main(String[] args) {
		@SuppressWarnings("unused")
        kuroB A = new kuroB();
		@SuppressWarnings("unused")
        kuroB B = new kuroB(128);
	}
}
