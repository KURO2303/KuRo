package com.mycompany.app.Week2_Code2.InitializationCleanup;
class InitTest {
	InitTest(String s) {
		System.out.println("InitTest()");
		System.out.println(s);
	}
}
public class InitializationCleanupEx18 {
    public static void main(String[] args) {
		InitTest[] it = new InitTest[5];
		for(int i = 0; i < it.length; i++)
			it[i] = new InitTest(Integer.toString(i));
	}
}
