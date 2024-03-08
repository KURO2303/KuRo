package com.mycompany.app.Week1_Code3;

public class Ex4 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean Prime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    Prime = false;
                    break;
                }
            }
            if(Prime) {
                System.out.print(i + " - ");
            }
        }
    }
    
}