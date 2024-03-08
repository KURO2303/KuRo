package com.mycompany.app.Week1;

public class EX7 {
    public void stop(){
        int n=100;
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
            if(i==99){
                return;
            }
        }
    }
}
