package com.mycompany.app.Week1;

public class EX9 {
    public static int fibo(int n){
        int x=0, y=1, z=1;
        if(n<0){
            return -1;
        } else if(n==0 || n==1){
            return n;
        } else{
            for (int i=2; i<n; i++) {
                x = y;
                y = z;
                z = x + y;
            }
        }
        return z;
    }
    public void fin(){
        for (int i=0; i<=5; i++){
            System.out.print(fibo(i)+" ");
}
}
}