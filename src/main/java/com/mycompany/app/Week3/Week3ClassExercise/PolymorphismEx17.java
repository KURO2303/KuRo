package com.mycompany.app.Week3.Week3ClassExercise;

class CycleEx17{
    void ride(){
        System.out.println("Riding a cycle");
    }
    public int wheels(){ //For exercise 5
        return 0;
    }
    public void balance() {
        throw new UnsupportedOperationException("balance");
    }
}
class UnicycleEx17 extends CycleEx17{
    @Override
    void ride(){
        System.out.println("Riding a unicycle");
    }
    public int wheels(){ //For exercise 5
        return 1;
    }
}
class BicycleEx17 extends CycleEx17{
    @Override
    void ride(){
        System.out.println("Riding a bicycle");
    }
    public int wheels(){ //For exercise 5
        return 2;
    }
}
class TricycleEx17 extends CycleEx17{
    @Override
    void ride(){
        System.out.println("Riding a tricycle");
    }
    public int wheels(){ //For exercise 5
        return 3;
    }
}

public class PolymorphismEx17 {
    public static void main(String[] args) {
        CycleEx17[] CyclesEx17 = new CycleEx17[3];
        CyclesEx17[0].balance();
        CyclesEx17[1].balance();
        CyclesEx17[2].balance();
        ((UnicycleEx17)CyclesEx17[0]).balance(); 
        ((BicycleEx17)CyclesEx17[1]).balance(); 
        ((UnicycleEx17)CyclesEx17[2]).balance(); 
    }
}
