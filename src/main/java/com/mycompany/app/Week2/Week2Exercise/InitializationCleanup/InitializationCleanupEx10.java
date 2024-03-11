package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

public class InitializationCleanupEx10 {
    public void finalize(){
        System.out.println("Finalize methods called");
    }
    public void lize() {
        @SuppressWarnings("unused")
        InitializationCleanupEx10 demo = new InitializationCleanupEx10();
        demo = null;// Mark the object for garbage collection
        System.gc();// Explicitly request garbage collection
        System.out.println("End of main method");
    }
}
