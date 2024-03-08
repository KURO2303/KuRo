package com.mycompany.app.Week2_Code2.Interfaces;

abstract class Dad {
	protected abstract void print();
	Dad() { print(); }
}

class Son extends Dad {
	private int i = 1;
    private void println(String string) {}
	@Override protected void print() { println("Son.i = " + i); } 
}

public class InterfacesEx3 {
	public static void main(String[] args) {
		Son s = new Son();
		s.print();
	}
}
