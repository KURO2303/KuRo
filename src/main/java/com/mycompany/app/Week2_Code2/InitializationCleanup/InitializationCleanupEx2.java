package com.mycompany.app.Week2_Code2.InitializationCleanup;

public class InitializationCleanupEx2 {
    private String directInitialization = "Initialized directly";

    public void Print(String[] args) {
        InitializationCleanupEx2 Duc1 = new InitializationCleanupEx2();
        System.out.println("Directly initialized value: " + Duc1.directInitialization);
    }
}
