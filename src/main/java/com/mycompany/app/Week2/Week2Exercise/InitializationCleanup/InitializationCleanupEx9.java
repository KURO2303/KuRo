package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

public class InitializationCleanupEx9 {
    @SuppressWarnings("unused")
    private int value;
    //first constructor
    public InitializationCleanupEx9(int i){
        this.value = i;
        System.out.println("value = " + i);
    }
    //second constructor
    public InitializationCleanupEx9(){
        this(0);//default value = 0
        System.out.println("Default value = 0");
    }
    @SuppressWarnings("unused")
    public void mo1() {
        InitializationCleanupEx9 demo1 = new InitializationCleanupEx9();
        InitializationCleanupEx9 demo2 = new InitializationCleanupEx9(185);
    }
}
