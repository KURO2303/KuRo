package com.mycompany.app.Week2.Week2Exercise.Interfaces;

import java.util.Random;

public class InterfacesEx7_backup {
    private Random rand = new Random();
	public RodentEx7 next() {
   	switch(rand.nextInt(3)) {
			default:
			case 0: return new MouseEx7();
			case 1: return new RatEx7();
			case 2: return new SquirrelEx7();			
		}
	}
}
