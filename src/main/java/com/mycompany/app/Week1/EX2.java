package com.mycompany.app.Week1;

import java.util.Random;

public class EX2 {
    public static void main(String[] args){
        Random rand = new Random();
        for(int i=1; i<=25; i++){
            int randNumber1 = rand.nextInt(100);
            int randNumber2= rand.nextInt(100);
            if(randNumber1>randNumber2){
                System.out.println(randNumber1+">"+randNumber2);
            } else if(randNumber1<randNumber2){
                System.out.println(randNumber1+"<"+randNumber2);
            } else {
                System.out.println("NO VALUE");
            }
        }
}
}
