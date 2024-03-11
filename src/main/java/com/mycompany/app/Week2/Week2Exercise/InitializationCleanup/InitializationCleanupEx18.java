package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;
class InitTest18 {
	InitTest18(String s) {
		System.out.println("InitTest()");
		System.out.println(s);
	}
}
public class InitializationCleanupEx18 {
    public void it18() {
		InitTest18[] it = new InitTest18[5];
		for(int i = 0; i < it.length; i++)
			it[i] = new InitTest18(Integer.toString(i));
	}
}
