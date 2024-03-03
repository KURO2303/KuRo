package com.mycompany.app.Week2.Week2Exercise.Polymorphism;

import com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX1;

@SuppressWarnings("unused")
public class Polymorphism_EX5 {
    public static void ride(Cycle c){
        System.out.println("Num. of wheels: " + c.wheels());
    }
    public void wheel(){
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
