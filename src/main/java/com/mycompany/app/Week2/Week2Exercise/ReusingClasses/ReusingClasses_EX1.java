package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

public class ReusingClasses_EX1 {
    public class soup{
        public String toString(){
            return "chicken soup";
        }
    }
    public class rice {
        public String toString(){
            return "fried rice";
        }
    }
    public void lunch() {
        rice r = new rice();
        soup s = new soup();
        System.out.println("KURO's lunch: "+s+" and "+r);
    }
}
