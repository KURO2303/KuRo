package com.mycompany.app.Week1;

public class EX5 {
    static void testEx10(){
        int a = 0xAA;
        int b = 0x55;

        System.out.println("Const a: " +Integer.toBinaryString(a));
        System.out.println("Const b: " +Integer.toBinaryString(b));
        System.out.println("AND: a&b= " +Integer.toBinaryString(a&b));
        System.out.println("OR: a|b= " +Integer.toBinaryString(a|b));
        System.out.println("XOR: a^b= " +Integer.toBinaryString(a^b));
        System.out.println(" ~a= " +Integer.toBinaryString(~a));
        System.out.println("~b= " +Integer.toBinaryString(~b));
    }


    public static void calc(int a, int b, String op, int isNot){
        int temp=   op.equals("&")?a&b:
                    op.equals("|")?a|b:
                    op.equals("^")?a^b:
                    op.equals("~")?~a:0;
        if(!op.equals("~"))
            System.out.println(a + op + b +" = "+ temp);
        else
            System.out.println(op+a+" = "+temp);
    }


    public void inter(){
        int a=0xAA;
        int b=0x55;
        calc(a,b,"&",0);
        calc(a,b,"|",0);
        calc(a,b,"^",1);
        calc(a,0,"~",0);
        calc(b,0,"~",0);
}
}
