package com.mycompany.app.Week2.Week2Exercise.Interfaces;

interface History15 {
	void u();
	void v();
}

interface Exam15 {
	void w();
	void x();
}

interface Labs15 {
	void y();
	void z();
}

interface Workup15 extends History15, Exam15, Labs15 {
	void zz();
}

abstract class Doctor15 {
	@SuppressWarnings("unused")
	private int i = 0;
	abstract void doc();
}

class Anesthesiologist15 extends Doctor15 implements Workup15 {
	@SuppressWarnings("unused")
	private int j = 0;
	public void u() {}
	public void v() {}
	public void w() {}
	public void x() {}
	public void y() {}
	public void z() {}
	public void zz() {}
	public void doc() {} // must override abstract method in Doctor 
}

public class InterfacesEx15 {
	public static void m1(History15 history) { history.v(); }
	public static void m2(Exam15 exam) { exam.w(); }
	public static void m3(Labs15 labs) { labs.y(); } 
	public static void m4(Workup15 workup) { workup.zz(); }
	public static void main(String[] args) {
		Anesthesiologist15 anes = new Anesthesiologist15();
		m1(anes);
		m2(anes);
		m3(anes);
		m4(anes);
	}
}