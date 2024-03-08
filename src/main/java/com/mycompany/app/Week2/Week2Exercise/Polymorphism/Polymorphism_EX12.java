package com.mycompany.app.Week2.Week2Exercise.Polymorphism;

class Member{
    public Member(String n){
        System.out.println("Member "+n);
    }
}
class Rodent{
    Member m1 = new Member("R"), m2 = new Member("r");
    public void eat(){
        System.out.println("Rodent eating nut");
    }
    public void sleep(){
        System.out.println("Rodent sleeping tight");
    }
}
class Mouse extends Rodent{
    Member m1 = new Member("M"), m2 = new Member("m");
    public void eat(){
        System.out.println("Mouse eating cheese");
    }
    public void sleep(){
        System.out.println("Mouse sleeping in hole");
    }
}
class Gerbil extends Rodent{
    Member m1 = new Member("G"), m2 = new Member("g");
    public void eat(){
        System.out.println("Gerbil eating berries");
    }
    public void sleep(){
        System.out.println("Gerbil sleeping in bushes");
    }
}
class Hamster extends Rodent{
    Member m1 = new Member("H"), m2 = new Member("h");
    public void eat(){
        System.out.println("Hamster eating food");
    }
    public void sleep(){
        System.out.println("Hamster sleeping in cage");
    }
}
    public class Polymorphism_EX12{
        public static void main(String[] args) {
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
