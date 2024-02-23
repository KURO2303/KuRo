package com.mycompany.app.New_Folder;

import java.util.Random;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args){
    Scanner Loop = new Scanner(System.in);
     boolean stop = false;
     Random rand = new Random();
     while(!stop){
            int randNumber1= rand.nextInt(100);
            int randNumber2= rand.nextInt(100);
            if(randNumber1>randNumber2){
                System.out.println(randNumber1+">"+randNumber2);
            } else if(randNumber1<randNumber2){
                System.out.println(randNumber1+"<"+randNumber2);
            } else {
                System.out.println("NO VALUE");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Loop.close();
        System.out.println("End");
        }
     }


