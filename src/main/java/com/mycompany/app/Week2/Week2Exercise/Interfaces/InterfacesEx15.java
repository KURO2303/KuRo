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

interface Workup extends History15, Exam15, Labs15 {
	void zz();
}

abstract class Doctor {
	@SuppressWarnings("unused")
	private int i = 0;
	abstract void doc();
}

class Anesthesiologist extends Doctor implements Workup {
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
	public static void m4(Workup workup) { workup.zz(); }
	public static void main(String[] args) {
		Anesthesiologist anes = new Anesthesiologist();
		m1(anes);
		m2(anes);
		m3(anes);
		m4(anes);
	}
}