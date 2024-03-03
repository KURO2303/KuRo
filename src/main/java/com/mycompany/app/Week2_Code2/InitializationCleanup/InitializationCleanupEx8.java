package com.mycompany.app.Week2_Code2.InitializationCleanup;

public class InitializationCleanupEx8 {
    public void method1(){
        System.out.println("First try!");
        method2();//without using "this"
        this.method2();//using "this"
    }
    public void method2(){
        System.out.println("Second try!");
    }
    public static void main(String[] args) {
        InitializationCleanupEx8 test = new InitializationCleanupEx8();
        test.method1();
    }
}
