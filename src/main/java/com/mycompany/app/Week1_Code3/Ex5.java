package com.mycompany.app.Week1_Code3;

public class Ex5 {
    public static void main(String[] args) {
        int a = 010111011;
        int b = 100111001;

        System.out.println("A= " + Integer.toBinaryString(a));
        System.out.println("B= " + Integer.toBinaryString(b));

        System.out.println("AND: a&b = " + Integer.toBinaryString(a&b));
        System.out.println("OR: a|b= " + Integer.toBinaryString(a|b));
        System.out.println("XOR: a^b= " + Integer.toBinaryString(a^b));
        System.out.println("~a= " + Integer.toBinaryString(~a));
        System.out.println("~b= "+ Integer.toBinaryString(~b));
    }
}
