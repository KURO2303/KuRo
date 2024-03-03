package com.mycompany.app.Week2_Code2.Interfaces;

abstract class Hadd {
}

class Kuro extends Hadd {
	protected void print() { println("Kuro"); }
    private void println(String string) {
    }
}

abstract class Hadd2 {
	abstract protected void print();
}

class Kuro2 extends Hadd2 {
	protected void print() { println("Kuro2"); }
    private void println(String string) {
    }
}

public class InterfacesEx4 {
	public static void testPrint(Hadd d) {
		((Kuro)d).print();
	}
	public static void secondTestPrint(Hadd2 sd) {
		sd.print();
	}
	public static void main(String[] args) {
		Kuro s = new Kuro();
		InterfacesEx4.testPrint(s);
		Kuro2 ss = new Kuro2();
		InterfacesEx4.secondTestPrint(ss);			
	}
}
