package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

public class InitializationCleanupEx6 {
    public void bark(int times,  String sound){
        for (int i = 0; i < times; i++){
            System.out.println(sound + " Woof!");
        }
    }
    public void bark(double pitch, String sound){
        System.out.println("Howl: "  + pitch + sound);
    }
    public void theDog() {
        InitializationCleanupEx6 Dog = new InitializationCleanupEx6();
        Dog.bark(3,"Woof!");
        Dog.bark(1.5, " Howling!");
    }
}
