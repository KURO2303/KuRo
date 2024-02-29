package com.mycompany.app.Week1_Code3;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
    Scanner Scan = new Scanner(System.in);
        boolean Stop = false;
        Random rand = new Random();
        while (!Stop){
            int randNumber1 = rand.nextInt(100);
            int randNumber2 = rand.nextInt(100);
            if (randNumber1 > randNumber2){
                System.out.println(randNumber1 + " > " + randNumber2);
            }
            else if (randNumber1 < randNumber2){
                System.out.println(randNumber1 + " < " + randNumber2);
            }
            else if (randNumber1 == randNumber2){
                System.out.println(randNumber1 + " = " + randNumber2);
            }
            else{
                System.out.println("Wrong!");
            }
        Scan.close();
        }
        

    }
    
}
