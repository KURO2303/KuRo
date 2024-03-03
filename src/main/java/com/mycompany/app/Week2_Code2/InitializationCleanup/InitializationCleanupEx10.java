package com.mycompany.app.Week2_Code2.InitializationCleanup;

public class InitializationCleanupEx10 {
    public void finalize(){
        System.out.println("Finalize methods called");
    }
    public static void main(String[] args) {
        InitializationCleanupEx10 demo = new InitializationCleanupEx10();
        demo = null;// Mark the object for garbage collection
        System.gc();// Explicitly request garbage collection
        System.out.println("End of main method");
    }
}
