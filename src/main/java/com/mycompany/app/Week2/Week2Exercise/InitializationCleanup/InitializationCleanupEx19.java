package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

public class InitializationCleanupEx19 {
    static void showStrings(String... args) {
		for(String s : args)
			System.out.print(s + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		showStrings("one", "two", "three", "four");
		showStrings(new String[]{"1", "2", "3", "4"});
	}
}
