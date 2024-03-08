package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

public class InitializationCleanupEx15 {
    public static void main(String[] args) {
		new Tester();				
	}
}
class Tester {
	String s;
	{
		s = "Initializing string in Tester";
		System.out.println(s);
	}
	Tester() {
		System.out.println("Tester()");
	}
}
