package com.mycompany.app.Week2_Code1;

public class Recursion {
    public long factorial( long number) {
        if (number <= 1) 
        return 1;
        else
        return number * factorial(number - 1);   
}
}