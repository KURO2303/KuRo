package com.mycompany.app.Week2.Week2Exercise.Interfaces;
abstract class Logo1 {
	void Nogo1() { System.out.println("Logo1()"); }
}

abstract class Logo2 {}

class Go1 extends Logo1 {
	Go1() { System.out.println("Go1()"); }
}
public class InterfacesEx2 {
    public void go() {
        @SuppressWarnings("unused")
        Go1 g1 = new Go1();
    }
}
