package com.mycompany.app.New_Folder;

import java.util.Random;

public class EX2 {
    public static void main(String[] args){
        Random rand = new Random();
        int[] randNumber1 = new int[25];
        int[] randNumber2 = new int[25];
        for(int i=1; i<=25; i++){
            randNumber1[i] = rand.nextInt(100);
            randNumber2[i] = rand.nextInt(100);
            if(randNumber1[i]>randNumber2[i]){
                System.out.println(randNumber1[i]+">"+randNumber2[i]);
            } else if(randNumber1[1]<randNumber2[2]){
                System.out.println(randNumber1[i]+"<"+randNumber2[i]);
            } else {
                System.out.println("NO VALUE");
            }
        }
}
}
