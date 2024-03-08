package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class Root2 {
	component1 component1A;
	component2 component2B;
	component3 component3C;
	Root2() {
		System.out.println("Root()");
		component1A = new component1();
		component2B = new component2();
		component3C = new component3();
	}
	void dispose() {
		component1A.dispose();
		component2B.dispose();
		component3C.dispose();
		System.out.println("Root.dispose()");
	}
	
}

class Stem2 extends Root2 {
	component1 component1a;
	component2 component2b;
	component3 component3c;
	Stem2(){
		super();
		System.out.println("Stem()");
		component1a = new component1();
		component2b= new component2();
		component3c = new component3();
	}
	void dispose() {
		component1a.dispose();
		component2b.dispose();
		component3c.dispose();
		System.out.println("Stem.dispose()");
		super.dispose();
	}
}

class component1 {
	component1() { System.out.println("1"); }
	void dispose() { System.out.println("1.dispose()"); }
}

class component2 {
	component2() { System.out.println("2"); }
	void dispose() { System.out.println("2.dispose()"); }
}

class component3 {
	component3() { System.out.println("3"); }
	void dispose() { System.out.println("3.dispose()"); }
}

public class ReusingClasses_EX12 {
    public static void main(String[] args) {
		Stem2 stem = new Stem2();
		System.out.println("****************");
		try {
			System.out.println("Hello");
		} finally {
			stem.dispose();
		}
	}
}
