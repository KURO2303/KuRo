package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

class Tank{
	boolean filled = false;
public void fill(){
		filled = true;
	}
	public void empty(){
		filled = false;
	}
	protected void finalize() {
		if(filled)
		System.out.println("Full tank!");
	}
}
public class InitializationCleanupEx12 {
	public static void main(String[] args){
		Tank bigtank = new Tank();
		System.out.println("Fillness tank is: " + bigtank.filled);
		bigtank.fill();
		System.out.println("Filled fillness is: " + bigtank.filled);
		System.gc();
		new Tank();
		System.out.println("Respawn tank is: " + bigtank.filled);
		bigtank.empty();
		System.out.println("Emptied fillness is: " + bigtank.filled);
		System.gc(); 
	}
}