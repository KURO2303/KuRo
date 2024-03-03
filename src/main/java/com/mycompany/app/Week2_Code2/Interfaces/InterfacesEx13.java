package com.mycompany.app.Week2_Code2.Interfaces;

interface CanDo {
	void doIt();
}

interface CanDoMore extends CanDo {
	void doMore();
}

interface CanDoFaster extends CanDo {
	void doFaster();
}

interface CanDoMost extends CanDoMore, CanDoFaster {
	void doMost();
}

class Doer implements CanDoMost {
	public void doIt() {}
	public void doMore() {}
	public void doFaster() {}
	public void doMost() {}
}

public class InterfacesEx13 {
	public static void main(String[] args) {
		Doer d = new Doer();
		((CanDoMore)d).doMore();
		((CanDoFaster)d).doFaster();
		((CanDo)d).doIt();	
	}
}