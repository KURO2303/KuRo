package com.mycompany.app.Week2_Code2.InitializationCleanup;

public class InitializationCleanupEx5{
        // Overloaded bark method for int
        public void bark(int times) {
            for (int i = 0; i < times; i++) {
                System.out.println("Woof!");
            }
        }
        public void bark(double pitch){
            System.out.println(pitch);
        }
    
        // Overloaded bark method for String
        public void bark(String sound) {
            System.out.println( sound);
        }
    
        public static void main(String[] args) {
            InitializationCleanupEx5 myDog = new InitializationCleanupEx5();
    
            myDog.bark(3); 
            myDog.bark("Sound loud " + 1.5);
            myDog.bark("Grrrr Woof!"); 
        }
    }
    
