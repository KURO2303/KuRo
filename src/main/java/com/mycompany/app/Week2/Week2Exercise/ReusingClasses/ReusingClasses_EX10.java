package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

import javax.swing.plaf.basic.BasicSliderUI.ComponentHandler;

@SuppressWarnings("unused")
class Root{
	Root(int i){ 
        System.out.println("Root("+i+")");
    }
	ComponentHandler1 A1;
	ComponentHandler2 B2;
	ComponentHandler3 C3;
}

class Stem extends Root{
	Stem(int i){ 
        super(i);
        System.out.println("Stem("+i*10+")"); 
    }
	ComponentHandler1 a1;
	ComponentHandler2 b2;
	ComponentHandler3 c3;
}

class ComponentHandler1{
	ComponentHandler1(int i){ 
        System.out.println("1"+i); 
    }
}

class ComponentHandler2{
	ComponentHandler2(int i){ 
        System.out.println("2"+i); 
    }
}

class ComponentHandler3{
	ComponentHandler3(int i){ 
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