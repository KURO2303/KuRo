package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class Root{
	Root(int i){ 
        System.out.println("Root("+i+")");
    }
	Component1 A1;
	Component2 B2;
	Component3 C3;
}

class Stem extends Root{
	Stem(int i){ 
        super(i);
        System.out.println("Stem("+i*10+")"); 
    }
	Component1 a1;
	Component2 b2;
	Component3 c3;
}

class Component1{
	Component1(int i){ 
        System.out.println("1"+i); 
    }
}

class Component2{
	Component2(int i){ 
        System.out.println("2"+i); 
    }
}

class Component3{
	Component3(int i){ 
        System.out.println("3"+i); 
    }
}
public class ReusingClasses_EX10 {
    public static void main(String[] args) {
		@SuppressWarnings("unused")
        Stem stem = new Stem(10);
	}
}

//This one not running, dunno why ;-;