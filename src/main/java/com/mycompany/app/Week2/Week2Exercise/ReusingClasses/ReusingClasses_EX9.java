package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class root{
	root(){ 
        System.out.println("Root()"); 
    }
	Component1 A;
	Component2 B;
	Component3 C;
}

class stem extends root{
	stem(){ 
        System.out.println("Stem()"); 
    }
	Component1 a;
	Component2 b;
	Component3 c;
}

class Component1{
	Component1(){ 
        System.out.println("1"); 
    }
}

class Component2{
	Component2(){ 
        System.out.println("2"); 
    }
}

class Component3{
	Component3(){ 
        System.out.println("3"); 
    }
}
public class ReusingClasses_EX9 {
    public static void main(String[] args) {
		@SuppressWarnings("unused")
        stem stem = new stem();
	}
}
