package com.mycompany.app.Week2.Week2Exercise.InitializationCleanup;

public class InitializationCleanupEx4 {
    private String message;
    public InitializationCleanupEx4(String string) {}
    public InitializationCleanupEx4() {}
    public void MessagePrinter() {
        this.message = "Hello everybody! It's me!";
        printMessage();
    }
    public void MessagePrinter(String customMessage) {
        this.message = customMessage;
        printMessage();
    }

    public void printMessage() {
        System.out.println("Message: " + message);
    }

    @SuppressWarnings("unused")
    public void nter4() {
        InitializationCleanupEx4 Printer1 = new InitializationCleanupEx4();
        InitializationCleanupEx4 Printer2 = new InitializationCleanupEx4("Another message :v");
        InitializationCleanupEx4 Printer3 = new InitializationCleanupEx4("I think that is a good idea");
    }
}
