package com.mycompany.app.Week2.Week2Exercise.AccessControl;

public class AccessControl_EX5_P1 {
    int a=10;
    public int b = 10;
    //private int c = 20; //when using private, c is indicate as unused :))) 
    protected int d = 30;

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
