package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class Root1 {
	Component1 component1A;
	Component2 component2B;
	Component3 component3C;
	Root1() {
		System.out.println("Root()");
		component1A = new Component1();
		component2B = new Component2();
		component3C = new Component3();
	}
	void dispose() {
		component1A.dispose();
		component2B.dispose();
		component3C.dispose();
		System.out.println("Root.dispose()");
	}
	
}

class Stem1 extends Root1 {
	Component1 component1a;
	Component2 component2b;
	Component3 component3c;
	Stem1(){
		super();
		System.out.println("Stem()");
		component1a = new Component1();
		component2b= new Component2();
		component3c = new Component3();
	}
	void dispose() {
		component1a.dispose();
		component2b.dispose();
		component3c.dispose();
		System.out.println("Stem.dispose()");
		super.dispose();
	}
}

class Component1 {
	Component1() { System.out.println("1"); }
	void dispose() { System.out.println("1.dispose()"); }
}

class Component2 {
	Component2() { System.out.println("2"); }
	void dispose() { System.out.println("2.dispose()"); }
}

class Component3 {
	Component3() { System.out.println("3"); }
	void dispose() { System.out.println("3.dispose()"); }
}

public class ReusingClasses_EX12 {
    public static void main(String[] args) {
		Stem1 stem = new Stem1();
		System.out.println("****************");
		try {
			System.out.println("Hello");
		} finally {
			stem.dispose();
		}
	}
}
