package com.mycompany.app.Week2.Week2Exercise.Interfaces;

abstract class RodentEx7 {
	@SuppressWarnings("unused")
	private String name = "Rodent";
	abstract protected void eat(); 
	abstract protected void run(); 
	abstract protected void sleep();
	abstract public String toString(); 
}

class MouseEx7 extends RodentEx7 {
	private String name = "Mouse";
	protected void eat() { println("Mouse.eat()"); }
	private void println(String string) {}
    protected void run() { println("Mouse.run()"); }
	protected void sleep() { println("Mouse.sleep()"); }
	public String toString() { return name; }
}

class RatEx7 extends RodentEx7 {
	private String name = "Rat";
	protected void eat() { println("Rat.eat()"); }
	private void println(String string) {}
    protected void run() { println("Rat.run()"); }
	protected void sleep() { println("Rat.sleep()"); }
	public String toString() { return name; }
}

class SquirrelEx7 extends RodentEx7 {
	private String name = "Squirrel";
	protected void eat() { println("Squirrel.eat()"); }
	private void println(String string) {}
    protected void run() { println("Squirrel.run()"); } 
	protected void sleep() { println("Squirrel.sleep()"); }
	public String toString() { return name; }
}

public class InterfacesEx1 {
	private static InterfacesEx1_backup gen = new InterfacesEx1_backup();
    private static void println(String string) {
    }
	public static void main(String[] args) {
		RodentEx7 rodents = new RodentEx7[];
		for(RodentEx7 r : rodents) {
			r = gen.next();
			println(r + ": ");
			r.eat();
			r.run();
			r.sleep();			
		}		
	}
}