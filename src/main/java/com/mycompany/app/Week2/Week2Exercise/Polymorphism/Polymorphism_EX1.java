package com.mycompany.app.Week2.Week2Exercise.Polymorphism;

class Cycle{
    void ride(){
        System.out.println("Riding a cycle");
    }
    public int wheels(){ //For exercise 5
        return 0;
    }
}
class Unicycle extends Cycle{
    @Override
    void ride(){
        System.out.println("Riding a unicycle");
    }
    public int wheels(){ //For exercise 5
        return 1;
    }
}
class Bicycle extends Cycle{
    @Override
    void ride(){
        System.out.println("Riding a bicycle");
    }
    public int wheels(){ //For exercise 5
        return 2;
    }
}
class Tricycle extends Cycle{
    @Override
    void ride(){
        System.out.println("Riding a tricycle");
    }
    public int wheels(){ //For exercise 5
        return 3;
    }
}
public class Polymorphism_EX1 {
    public void bike(){
        Cycle cycle1 = new Unicycle();
        Cycle cycle2 = new Bicycle();
        Cycle cycle3 = new Tricycle();

        ride(cycle1);
        ride(cycle2);
        ride(cycle3);
    }
    static void ride(Cycle cycle){
        cycle.ride();
    }
}
