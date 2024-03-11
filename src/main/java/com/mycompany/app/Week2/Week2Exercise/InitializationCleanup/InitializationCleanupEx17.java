package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

public class InitializationCleanupEx17 {
    public void it() {
		@SuppressWarnings("unused")
		InitTest[] it = new InitTest[10];
	}
}
class InitTest {
	InitTest(String s) {
		System.out.println("InitTest()");
		System.out.println(s);
	}
}