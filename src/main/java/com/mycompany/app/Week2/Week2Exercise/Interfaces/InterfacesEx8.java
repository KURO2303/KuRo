package com.mycompany.app.Week2.Week2Exercise.Interfaces;
    interface FastFood {
        void cheeseburger();
        void fries();
        void softDrink();
    }
    
    class Meal {
        private void print(String string) {} 
        Meal() { 
            print("Meal()"); 
        }
    }
    
    class Bread {
        private void print(String string) {} 
        Bread() { print("Bread()"); } 
    }
    
    class Cheese {
        private void print(String string) {} 
        Cheese() { print("Cheese()"); } 
    }
    
    class Lettuce {
        private void print(String string) {} 
        Lettuce() { print("Lettuce()"); } 
    }
    
    class Lunch extends Meal {
        private void print(String string) {} 
        Lunch() { print("Lunch()"); } 
    }
    
    class PortableLunch extends Lunch {
        private void print(String string) {} 
        PortableLunch() { print("PortableLunch()"); } 
    }	
    
    public class InterfacesEx8 extends PortableLunch implements FastFood {
        private void print(String string) {} 
        @SuppressWarnings("unused")
        private Bread b = new Bread();
        @SuppressWarnings("unused")
        private Cheese c = new Cheese();
        @SuppressWarnings("unused")
        private Lunch l = new Lunch();
        public InterfacesEx8() { print("Sandwich8()"); }
        public void cheeseburger() {
            print("Cheeseburger");
        }
        public void fries() {
            print("Fries");
        }
        public void softDrink(){
            print("Soft Drink");
        }
        public static void main(String[] args) {
            InterfacesEx8 s = new InterfacesEx8();
            s.cheeseburger();
            s.fries();
            s.softDrink();
            
        } 
    }

