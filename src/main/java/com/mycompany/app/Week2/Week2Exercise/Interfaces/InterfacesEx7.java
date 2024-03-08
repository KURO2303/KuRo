package com.mycompany.app.Week2.Week2Exercise.Interfaces;

interface RodentEx7 {
	String name = "Rodent";
	void eat(); 
	void run(); 
	void sleep();
	String toString(); 
}

class MouseEx7 implements RodentEx7 {
	private String name = "Mouse";
    private void print(String string){}
	public void eat() { print("Mouse.eat()"); }
	public void run() { print("Mouse.run()"); }
	public void sleep() { print("Mouse.sleep()"); }
	public String toString() { return name; }
}

class RatEx7 implements RodentEx7 {
	private String name = "Rat";
    private void print(String string) {}
	public void eat() { print("Rat.eat()"); }
    public void run() { print("Rat.run()"); }
	public void sleep() { print("Rat.sleep()"); }
	public String toString() { return name; }
}

class SquirrelEx7 implements RodentEx7 {
	private String name = "Squirrel";
    private void print(String string) {}
	public void eat() { print("Squirrel.eat()"); }
	public void run() { print("Squirrel.run()"); }
	public void sleep() { print("Squirrel.sleep()"); }
	public String toString() { return name; }
}

public class InterfacesEx7 {
	private static InterfacesEx7_backup gen = new InterfacesEx7_backup();
    private static void print(String string) {}
	public static void main(String[] args) {
		
		RodentEx7[] rodents = new RodentEx7[10];
		for(RodentEx7 r : rodents) {
			r = gen.next();
			print(r + ": ");
			r.eat();
			r.run();
			r.sleep();			
		}		
	}
}
