package com.mycompany.app.Week1;

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
     public void E_N(){
        for(int i=0; i<100; i++){
            if(Number(i)==true){
                    System.out.print(i+" ");
                }
        }
}
}
