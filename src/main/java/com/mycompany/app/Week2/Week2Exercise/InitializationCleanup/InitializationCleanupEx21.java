package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

public class InitializationCleanupEx21 {
    public enum Hadd {
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
	public void dd21() {
		for(Hadd b : Hadd.values())
			System.out.println(b + ", ordinal " + b.ordinal());	
	}	
}
