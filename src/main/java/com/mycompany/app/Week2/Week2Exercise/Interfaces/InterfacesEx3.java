package com.mycompany.app.Week2.Week2Exercise.Interfaces;

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
	public void n() {
		Son s = new Son();
		s.print();
	}
}
