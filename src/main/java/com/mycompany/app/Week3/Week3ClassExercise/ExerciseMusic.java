package com.mycompany.app.Week3.Week3ClassExercise;

class Note{
    public static final Note MIDDLE_C = null;
}
class Instrument {
    void play(Note n) { 
        System.out.println("Instrument.play() " + n); 
    }
    String what() { 
        return "Instrument"; 
    }
    void adjust() { 
        System.out.println("Adjusting Instrument"); 
    }
   }
   class Wind extends Instrument {
    void play(Note n) { 
        System.out.println("Wind.play() " + n); 
    }
    String what() { return "Wind"; }
    void adjust() { 
        System.out.println("Adjusting Wind"); 
    }
   }
   class Percussion extends Instrument {
    void play(Note n) { 
        System.out.println("Percussion.play() " + n); 
    }
    String what() { 
        return "Percussion"; 
    }
    void adjust() { 
        System.out.println("Adjusting Percussion"); 
    }
   }
   class Stringed extends Instrument {
    void play(Note n) { 
        System.out.println("Stringed.play() " + n); 
    }
 String what() { 
    return "Stringed"; 
}
 void adjust() { 
    System.out.println("Adjusting Stringed"); 
}
}
class Brass extends Wind {
 void play(Note n) { 
    System.out.println("Brass.play() " + n); 
}
 void adjust() { 
    System.out.println("Adjusting Brass"); 
}
}
class Woodwind extends Wind {
 void play(Note n) { 
    System.out.println("Woodwind.play() " + n); 
}
 String what() { return "Woodwind"; }
}
public class ExerciseMusic {
    public static void tune(Instrument orchestra) {
        orchestra.play(Note.MIDDLE_C);
        }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Instrument[] orchestra = {
        new Wind(),
        new Percussion(),
        new Stringed(),
        new Brass(),
        new Woodwind()
        };
        //tune(orchestra);
    }
}
