package com.mycompany.app.Week3.Week3ClassExercise;

interface MyInterface {
    void method1();
    void method2();
static class NestedClass {
    static void callMethods(MyInterface obj) {
        obj.method1();
        obj.method2();
    }
    }
}
class MyClass implements MyInterface {
    @Override
    public void method1() {
        System.out.println("Inside method1");
    }
    @Override
    public void method2() {
        System.out.println("Inside method2");
    }
}
public class Interface_Ex21 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        MyInterface.NestedClass.callMethods(obj);
    }
}