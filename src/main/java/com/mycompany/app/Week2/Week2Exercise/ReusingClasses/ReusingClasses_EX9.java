package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class root1{
	root1(){ 
        System.out.println("Root()"); 
    }
	Component1ex9 A;
	Component2ex9 B;
	Component3ex9 C;
}

class stem1 extends root1{
	stem1(){ 
        System.out.println("Stem()"); 
    }
	Component1ex9 a;
	Component2ex9 b;
	Component3ex9 c;
}

class Component1ex9{
	Component1ex9(){ 
        System.out.println("1"); 
    }
}

class Component2ex9{
	Component2ex9(){ 
        System.out.println("2"); 
    }
}

class Component3ex9{
	Component3ex9(){ 
        System.out.println("3"); 
    }

}
public class ReusingClasses_EX9 {
    public static void main(String[] args) {
		@SuppressWarnings("unused")
        stem1 stem = new stem1();
	}
}
