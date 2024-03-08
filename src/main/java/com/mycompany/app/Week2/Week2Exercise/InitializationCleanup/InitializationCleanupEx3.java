package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

public class InitializationCleanupEx3 {
    public void Messenger(){
        System.out.println("Hello guys!");
    }

    public void Printer(){
        @SuppressWarnings("unused")
        InitializationCleanupEx3 Messenger = new InitializationCleanupEx3();
    }
}
