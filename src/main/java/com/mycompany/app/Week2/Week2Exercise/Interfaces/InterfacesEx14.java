package com.mycompany.app.Week2.Week2Exercise.Interfaces;

interface History14 {
	void u();
	void v();
}

interface Exam14 {
	void w();
	void x();
}

interface Labs14 {
	void y();
	void z();
}

interface Workup14 extends History14, Exam14, Labs14 {
	void zz();
}

class Doctor14 {
	@SuppressWarnings("unused")
	private int i = 0;
	public void doc() {}
}

class Anesthesiologist14 extends Doctor14 implements Workup14 {
	@SuppressWarnings("unused")
	private int j = 0;
	public void u() {}
	public void v() {}
	public void w() {}
	public void x() {}
	public void y() {}
	public void z() {}
	public void zz() {}
}

public class InterfacesEx14 {
	public static void m1(History14 history) { history.v(); }
	public static void m2(Exam14 exam) { exam.w(); }
	public static void m3(Labs14 labs) { labs.y(); } 
	public static void m4(Workup14 workup) { workup.zz(); }
	public static void main(String[] args) {
		Anesthesiologist14 anes = new Anesthesiologist14();
		m1(anes);
		m2(anes);
		m3(anes);
		m4(anes);
	}
}