package com.mycompany.app.Week2.Week2Exercise.ReusingClasses.ReusingClasses_EX2;

public class Sterilizer extends Detergent{
	public void scrub() {
	    append(" Sterilizer.scrub()");
	}
	public void sterilize() {
		append(" sterilize()");
	}
	public static void main(String[] args) {
		Sterilizer x = new Sterilizer();
	    x.dilute();
	    x.apply();
	    x.scrub();
	    x.foam();
	    x.sterilize();
	    System.out.print(x);
	    System.out.print("Testing base class:");
	    Detergent.main(args);
	}

}