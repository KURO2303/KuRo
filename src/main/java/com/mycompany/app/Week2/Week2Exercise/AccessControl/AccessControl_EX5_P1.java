package com.mycompany.app.Week2.Week2Exercise.AccessControl;

public class AccessControl_EX5_P1 {
    int a;
    public int b;
    //private int c; //when using private, c is indicate as unused :))) 
    protected int d;

    void NormalAccess() {
        System.out.println("KURO");
    }

    public void PublicAccess() {
        System.out.println("Peko");
    }

    //private void PrivateAccess() { //Also indicate as unused because of private
    //    System.out.println("Fuu");
    //}

    //Add "//"" above because I don't want to see errors :)))

    protected void ProtectedAccess() {
        System.out.println("AlexCris");
    }
}
