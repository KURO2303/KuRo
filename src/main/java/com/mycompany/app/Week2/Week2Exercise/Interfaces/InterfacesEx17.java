package com.mycompany.app.Week2.Week2Exercise.Interfaces;

interface Days17 {
	int SUNDAY = 1, MONDAY = 2, TUESDAY = 3, WEDNESDAY = 4, 
		THURSDAY = 5, FRIDAY = 6, SATURDAY = 7; 
}

class Week17 implements Days17 {
	private static int count = 0;
	private int id = count++;
	public Week17() { System.out.println("Week() " + id); }
}

public class InterfacesEx17 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Without any objects, static fields exist:
		System.out.println("SUNDAY = " + Days17.SUNDAY);
		System.out.println("MONDAY = " + Days17.MONDAY);
		Week17 w0 = new Week17();
		Week17 w1 = new Week17();
		// Error: cannot assign a value to final variable SUNDAY:
		// w.SUNDAY = 2;
		// Error: cannot assign a value to final variable MONDAY: 
		// w1.MONDAY = w0.MONDAY;
	}
}