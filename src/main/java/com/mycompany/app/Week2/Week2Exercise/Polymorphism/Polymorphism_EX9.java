package com.mycompany.app.Week2.Week2Exercise.Polymorphism;

class rodent9{
    public void eat(){
        System.out.println("Rodent eating nut");
    }
    public void sleep(){
        System.out.println("Rodent sleeping tight");
    }
}
class mouse9 extends rodent9{
    public void eat(){
        System.out.println("Mouse eating cheese");
    }
    public void sleep(){
        System.out.println("Mouse sleeping in hole");
    }
}
class gerbil9 extends rodent9{
    public void eat(){
        System.out.println("Gerbil eating berries");
    }
    public void sleep(){
        System.out.println("Gerbil sleeping in bushes");
    }
}
class hamster9 extends rodent9{
    public void eat(){
        System.out.println("Hamster eating food");
    }
    public void sleep(){
        System.out.println("Hamster sleeping in cage");
    }
}
    public class Polymorphism_EX9{
        public void mice(){
            rodent9[] rodents = new rodent9[3];
            rodents[0] = new mouse9();
            rodents[1] = new gerbil9();
            rodents[2] = new hamster9();
            for (rodent9 rodent : rodents) {
                rodent.eat();
                rodent.sleep();
                System.out.println();
    }
}
}