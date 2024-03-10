package com.mycompany.app.Week2.Week2Exercise.Interfaces;

import com.mycompany.app.Week2.Week2Exercise.Polymorphism.Note;
abstract class Instrument {
	@SuppressWarnings("unused")
	private int i; 
	public abstract void play(Note n);
	public String toString() { return "Instrument"; } 
	public abstract void adjust(); 
}

class Wind extends Instrument {
	private void print(String string) {
	}
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public String toString() { return "Wind"; }
	public void adjust() { print(this + ".adjust()"); }
}

class Percussion extends Instrument {
	private void print(String string) {
	}
	public void play(Note n) {
		print(this + ".play() " + n);
	}
	public String toString() { return "Percussion"; }
	public void adjust() { print(this + ".adjust()"); }
}

class Stringed extends Instrument {
	private void print(String string) {
	} 
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

public class InterfacesEx9 {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e) {
		for(Instrument i : e)
			tune(i);
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		tuneAll(orchestra);
	}
}