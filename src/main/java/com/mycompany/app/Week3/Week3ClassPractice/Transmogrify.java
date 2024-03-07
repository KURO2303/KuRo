package com.mycompany.app.Week3.Week3ClassPractice;

abstract class Actor {
    abstract void act();
   }
class HappyActor extends Actor {
    public void act() {
        System.out.println("Happy Actor"); 
    }
}
class SadActor extends Actor {
    public void act() { 
        System.out.println("Sad Actor");
    }
}
class Stage {
    Actor a = new HappyActor();
    void change() { 
        a = new SadActor(); 
    }
    void go() { 
        a.act(); 
    }
}

public class Transmogrify {
    public void morgrifty(){
        Stage s = new Stage();
        s.go();
        s.change();
        s.go(); 
    }
}
