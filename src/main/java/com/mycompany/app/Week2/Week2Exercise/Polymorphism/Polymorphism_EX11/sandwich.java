package com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX11;

class Meal {
    Meal() { 
        System.out.println("Meal()"); 
    }
   }
class Bread {
    Bread() { 
        System.out.println("Bread()"); 
    }
   }
class Cheese {
    Cheese() { 
        System.out.println("Cheese()"); 
    }
   }
class Lettuce {
    Lettuce() { 
        System.out.println("Lettuce()"); 
    }
   }
class Pickle{
    Pickle(){
        System.out.println("Pickle");
    }
}
class Lunch extends Meal {
    Lunch() { 
        System.out.println("Lunch()"); 
    }
   }
class PortableLunch extends Lunch {
    PortableLunch() { 
        System.out.println("PortableLunch()");
    }
   }
public class sandwich extends PortableLunch {
    @SuppressWarnings("unused")
    private Bread b = new Bread();
    @SuppressWarnings("unused")
    private Cheese c = new Cheese();
    @SuppressWarnings("unused")
    private Lettuce l = new Lettuce();
    @SuppressWarnings("unused")
    private Pickle p = new Pickle();
public sandwich() { 
        System.out.println("Sandwich()"); 
    }
public void andwich() {
    new sandwich();
    }
   }