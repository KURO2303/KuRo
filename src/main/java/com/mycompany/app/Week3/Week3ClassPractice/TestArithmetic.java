package com.mycompany.app.Week3.Week3ClassPractice;

class Node{
    public double eval() {
        System.out.println("Error: eval Node");
        return 0;
    }
}
class Binop extends Node {
    protected Node lChild, rChild;
    public Binop(Node l, Node r) {
    lChild = l;
    rChild = r;
    }
}
class Plus extends Binop {
    public Plus(Node l, Node r) {
    super(l, r);
    }
    public double eval() {
    return lChild.eval() + rChild.eval(); 
    }
}
class Const extends Node {
    private double value;
    public Const(double d) { value = d; }
    public double eval() { return value; }
}

public class TestArithmetic {
    public void Arithmetic() {
        Node n = new Plus(
        new Plus(
        new Const(1.1), new Const(2.2)),
        new Const(3.3));
        System.out.println(""+ n.eval());
        }
}
