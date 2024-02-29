package com.mycompany.app.Week1_Code3;

import java.util.Random;

public class Ex2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] randNumber = new int[25];

        for (int i = 0; i<25; i++){
            randNumber[i] = rand.nextInt(100);
}

        for(int i = 0; i<25; i++) {
            if (randNumber[i] < randNumber[i + 1]) {
                System.out.println("Number " + randNumber[i] + " < " + randNumber[i + 1]);
            } else if (randNumber[i] > randNumber[i + 1]) {
                System.out.println("Number " + randNumber[i] + " >" + randNumber[i + 1]);
            } else if (randNumber[i] == randNumber[i + 1]) {
                System.out.println("Number " + randNumber[i] + " equal to " + randNumber[i + 1]);
            } else {
                System.out.println("No Value!");
            }
 }
    }
    

    }


