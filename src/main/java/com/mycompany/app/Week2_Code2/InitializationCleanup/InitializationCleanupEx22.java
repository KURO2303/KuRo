package com.mycompany.app.Week2_Code2.InitializationCleanup;

public class InitializationCleanupEx22 {
    public enum Hadd1 {
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
	}
    Hadd1 b;
	public static void main(String[] args) {
		for(Hadd1 b : Hadd1.values()) {
			System.out.print("Worth: ");
			switch(b) {
				case ONE: System.out.println("$1"); break; 
				case FIVE: System.out.println("$5"); break;
				case TEN: System.out.println("$10"); break;
				case TWENTY: System.out.println("$20"); break; 
				case FIFTY: System.out.println("$50"); break;
				case HUNDRED: System.out.println("$100"); break;
				default: break;
			}
		}	
	}
}
