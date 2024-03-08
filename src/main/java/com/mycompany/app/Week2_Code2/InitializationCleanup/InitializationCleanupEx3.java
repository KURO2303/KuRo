package com.mycompany.app.Week2_Code2.InitializationCleanup;

public class InitializationCleanupEx3 {
    public void Messenger(){
        System.out.println("Hello guys!");
    }

    public void Printer(){
        @SuppressWarnings("unused")
        InitializationCleanupEx3 Messenger = new InitializationCleanupEx3();
    }
}
