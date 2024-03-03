package com.mycompany.app.Week2_Code2.Interfaces;

import java.util.Random;

public class InterfacesEx7_backup {
    private Random rand = new Random();
	public Rodent next() {
   	switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse();
			case 1: return new Rat();
			case 2: return new Squirrel();			
		}
	}
}
