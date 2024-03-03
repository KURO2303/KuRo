package com.mycompany.app.Week2_Code2.Interfaces;

interface Instrument {
	int VALUE = 5; // static and final
	void adjust(); 
}

interface Playable<Note> {
	void play(Note n); // Automatically public
}

class Wind implements Instrument, Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public String toString() { return "Wind"; }
	public void adjust() { print(this + ".adjust()"); }
    private void print(String string) {}
    @Override public void play(Object n) {}
}


class Percussion implements Instrument, Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public String toString() { return "Percussion"; }
	public void adjust() { print(this + ".adjust()"); }
}

class Stringed implements Instrument, Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public String toString() { return "Stringed"; }
	public void adjust() { print(this + ".adjust()"); }
}

class Brass extends Wind {
	public String toString() { return "Brass"; }
}

class Woodwind extends Wind {
	public String toString() { return "Woodwing"; }
}

public class InterfacesEx10 {
	// Doesn't care about type, so new types
	// added to the system will work right:
	static void tune(Playable p) {
		//...
		p.play(Note.MIDDLE_C);
	}
	static void tuneAll(Playable[] e) {
		for(Playable p : e)
			tune(p);
	}
	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		tuneAll(orchestra);
	}
}