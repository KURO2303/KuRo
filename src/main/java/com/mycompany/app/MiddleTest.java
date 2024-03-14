package com.mycompany.app;

class Note1{
    public static String a = "A";
    public static String b = "B";
    public static String c = "MIDDLE_C";
    public static String d = "D";
    public static String e = "E";
    public static String f = "F";
    public static String g = "G";
}
abstract class Instrument1 {
    abstract void play(String n);
    String what() { 
        return "Instrument"; 
    }
    abstract void adjust();
   }
   class Wind1 extends Instrument1 {
    public void play(String n) {
    System.out.println("Play wind instrument in " + n);
    }
    public String what() { return "Wind"; }
    public void adjust() {}
   }
   class Percussion1 extends Instrument1 {
    public void play(String n) {
        System.out.println("Play percussion instrument in " + n);
    }
    public String what() { return "Percussion"; }
    public void adjust() {}
   }
   class Stringed1 extends Instrument1 {
    public void play(String n) {
        System.out.println("Play stringed instrument in " + n);
    }
    public String what() { return "Stringed"; }
    public void adjust() {}
   }
   class Brass1 extends Wind1 {
    public void play(String n) {
        System.out.println("Play brass instrument in " + n);
    }
    public void adjust() { System.out.println("Brass.adjusted"); 
    }
   }
   class Woodwind1 extends Wind1 {
    public void play(String n) {
        System.out.println("Play woodwind instrument in " + n);
    }
    public String what() { return "Woodwind"; }
   }
   public class MiddleTest {
    static void tune(Instrument1 i) {
    i.play(Note1.c);
    }
    static void tuneAll(Instrument1[] I) {
    for(Instrument1 i : I)
    tune(i);
    }
    public static void main(String[] args) {
    Instrument1[] orchestra = {
    new Wind1(),
    new Percussion1(),
    new Stringed1(),
    new Brass1(),
    new Woodwind1()
    };
    tuneAll(orchestra);
 }
}
