package com.mycompany.app.Week2_Code2.Interfaces;

abstract class Rodent {
	@SuppressWarnings("unused")
	private String name = "Rodent";
	abstract protected void eat(); 
	abstract protected void run(); 
	abstract protected void sleep();
	abstract public String toString(); 
}

class Mouse extends Rodent {
	private String name = "Mouse";
	protected void eat() { println("Mouse.eat()"); }
	private void println(String string) {}
    protected void run() { println("Mouse.run()"); }
	protected void sleep() { println("Mouse.sleep()"); }
	public String toString() { return name; }
}

class Rat extends Rodent {
	private String name = "Rat";
	protected void eat() { println("Rat.eat()"); }
	private void println(String string) {}
    protected void run() { println("Rat.run()"); }
	protected void sleep() { println("Rat.sleep()"); }
	public String toString() { return name; }
}

class Squirrel extends Rodent {
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
		Rodent[] rodents = new Rodent[10];
		for(Rodent r : rodents) {
			r = gen.next();
			println(r + ": ");
			r.eat();
			r.run();
			r.sleep();			
		}		
	}
}