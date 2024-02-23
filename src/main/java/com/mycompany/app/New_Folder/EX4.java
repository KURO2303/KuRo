package com.mycompany.app.New_Folder;

public class EX4 {
    public static boolean Number(int n){
        if(n<2){
            return false;
        } else {
        for (int i=2; i<=java.lang.Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        }
        return true;
    }
     public static void main(String[] args){
        for(int i=0; i<100; i++){
            if(Number(i)==true){
                    System.out.println(i);
                }
        }
}
}
