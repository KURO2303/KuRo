package com.mycompany.app.Week2_Code2.InitializationCleanup;

public class InitializationCleanupEx21 {
    public enum Hadd {
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
	public static void main(String[] args) {
		for(Hadd b : Hadd.values())
			System.out.println(b + ", ordinal " + b.ordinal());	
	}	
}
