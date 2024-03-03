package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class KuroA{
	KuroA(int i){ 
        System.out.println("KURO("+i+")"); 
    }
}
class  KuroB extends KuroA{
	KuroB(){
		super(0);
		System.out.println("KURO()");
    }
	KuroB(int i){
		super(i);
		System.out.println("KURO("+i+")"); 
    }
}
public class ReusingClasses_EX8 {
    public static void main(String[] args) {
		@SuppressWarnings("unused")
        KuroB A = new KuroB();
		@SuppressWarnings("unused")
        KuroB B = new KuroB(128);
	}
}
