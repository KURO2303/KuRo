package com.mycompany.app.Week2.Week2ClassPractice;

public class recursion {
    public int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
}
}
