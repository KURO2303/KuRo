package com.mycompany.app.Week2.Week2Exercise.Polymorphism;

class rodent{
    public void eat(){
        System.out.println("Rodent eating nut");
    }
    public void sleep(){
        System.out.println("Rodent sleeping tight");
    }
}
class mouse extends rodent{
    public void eat(){
        System.out.println("Mouse eating cheese");
    }
    public void sleep(){
        System.out.println("Mouse sleeping in hole");
    }
}
class gerbil extends rodent{
    public void eat(){
        System.out.println("Gerbil eating berries");
    }
    public void sleep(){
        System.out.println("Gerbil sleeping in bushes");
    }
}
class hamster extends rodent{
    public void eat(){
        System.out.println("Hamster eating food");
    }
    public void sleep(){
        System.out.println("Hamster sleeping in cage");
    }
}
    public class Polymorphism_EX9{
        public void mice(){
            rodent[] rodents = new rodent[3];
            rodents[0] = new mouse();
            rodents[1] = new gerbil();
            rodents[2] = new hamster();
            for (rodent rodent : rodents) {
                rodent.eat();
                rodent.sleep();
                System.out.println();
    }
}
}