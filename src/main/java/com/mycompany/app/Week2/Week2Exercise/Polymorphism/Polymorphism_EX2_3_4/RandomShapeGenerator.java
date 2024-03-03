package com.mycompany.app.Week2.Week2Exercise.Polymorphism.Polymorphism_EX2_3_4;

import java.util.Random;

class Shape {
    public void draw() {}
    public void erase() {}
}
class Circle extends Shape {
    @Override
    public void draw() { 
        System.out.println("Circle.draw()"); 
    }
    @Override
    public void erase() { 
        System.out.println("Circle.erase()"); 
    } 
} 
class Square extends Shape {
    @Override
    public void draw() { 
        System.out.println("Square.draw()"); 
    }
    @Override
    public void erase() { 
        System.out.println("Square.erase()"); 
    }
}
class Triangle extends Shape {
    @Override
    public void draw() { 
        System.out.println("Triangle.draw()"); 
    }
    @Override
    public void erase() { 
        System.out.println("Triangle.erase()"); 
    }
}
public class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
    switch(rand.nextInt(3)) {
    default:
    case 0: return new Circle();
    case 1: return new Square();
    case 2: return new Triangle();
    }
    }
   }