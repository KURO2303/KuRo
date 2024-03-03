package com.mycompany.app.Week2.Week2Exercise.Polymorphism;

class Rodent{
    public void eat(){
        System.out.println("Rodent eating nut");
    }
    public void sleep(){
        System.out.println("Rodent sleeping tight");
    }
}
class Mouse extends Rodent{
    public void eat(){
        System.out.println("Mouse eating cheese");
    }
    public void sleep(){
        System.out.println("Mouse sleeping in hole");
    }
}
class Gerbil extends Rodent{
    public void eat(){
        System.out.println("Gerbil eating berries");
    }
    public void sleep(){
        System.out.println("Gerbil sleeping in bushes");
    }
}
class Hamster extends Rodent{
    public void eat(){
        System.out.println("Hamster eating food");
    }
    public void sleep(){
        System.out.println("Hamster sleeping in cage");
    }
}
    public class Polymorphism_EX9{
        public void mice(){
            Rodent[] rodents = new Rodent[3];
            rodents[0] = new Mouse();
            rodents[1] = new Gerbil();
            rodents[2] = new Hamster();
            for (Rodent rodent : rodents) {
                rodent.eat();
                rodent.sleep();
                System.out.println();
    }
}
}