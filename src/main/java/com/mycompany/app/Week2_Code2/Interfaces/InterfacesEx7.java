package com.mycompany.app.Week2_Code2.Interfaces;

interface Rodent {
	String name = "Rodent";
	void eat(); 
	void run(); 
	void sleep();
	String toString(); 
}

class Mouse implements Rodent {
	private String name = "Mouse";
    private void print(String string){}
	public void eat() { print("Mouse.eat()"); }
	public void run() { print("Mouse.run()"); }
	public void sleep() { print("Mouse.sleep()"); }
	public String toString() { return name; }
}

class Rat implements Rodent {
	private String name = "Rat";
    private void print(String string) {}
	public void eat() { print("Rat.eat()"); }
    public void run() { print("Rat.run()"); }
	public void sleep() { print("Rat.sleep()"); }
	public String toString() { return name; }
}

class Squirrel implements Rodent {
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
		
		Rodent[] rodents = new Rodent[10];
		for(Rodent r : rodents) {
			r = gen.next();
			print(r + ": ");
			r.eat();
			r.run();
			r.sleep();			
		}		
	}
}
