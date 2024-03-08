package com.mycompany.app.Week2_Code2.InitializationCleanup;

public class InitializationCleanupEx17 {
    public static void main(String[] args) {
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