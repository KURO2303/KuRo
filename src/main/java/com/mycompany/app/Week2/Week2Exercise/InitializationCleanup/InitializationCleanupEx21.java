package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

public class InitializationCleanupEx21 {
    public enum Hadd {
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
	public static void main(String[] args) {
		for(Hadd b : Hadd.values())
			System.out.println(b + ", ordinal " + b.ordinal());	
	}	
}
