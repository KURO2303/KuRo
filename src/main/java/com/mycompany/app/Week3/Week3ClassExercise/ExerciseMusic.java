package com.mycompany.app.Week3.Week3ClassExercise;

class Note{
    public static String a = "A";
    public static String b = "B";
    public static String c = "MIDDLE_C";
    public static String d = "D";
    public static String e = "E";
    public static String f = "F";
    public static String g = "G";
}
abstract class Instrument {
    abstract void play(String n);
    String what() { 
        return "Instrument"; 
    }
    abstract void adjust();
   }
   class Wind extends Instrument {
    public void play(String n) {
    System.out.println("Play wind instrument in " + n);
    }
    public String what() { return "Wind"; }
    public void adjust() {}
   }
   class Percussion extends Instrument {
    public void play(String n) {
        System.out.println("Play percussion instrument in " + n);
    }
    public String what() { return "Percussion"; }
    public void adjust() {}
   }
   class Stringed extends Instrument {
    public void play(String n) {
        System.out.println("Play stringed instrument in " + n);
    }
    public String what() { return "Stringed"; }
    public void adjust() {}
   }
   class Brass extends Wind {
    public void play(String n) {
        System.out.println("Play brass instrument in " + n);
    }
    public void adjust() { System.out.println("Brass.adjusted"); 
    }
   }
   class Woodwind extends Wind {
    public void play(String n) {
        System.out.println("Play woodwind instrument in " + n);
    }
    public String what() { return "Woodwind"; }
   }
   public class ExerciseMusic {
    static void tune(Instrument i) {
    i.play(Note.c);
    }
    static void tuneAll(Instrument[] I) {
    for(Instrument i : I)
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
