/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app.Week1;


public class App {
    public static void main(String[] args) {
        EX1 temp = new EX1();
        temp.count();
        System.out.println(" ");
        System.out.println(" ");

        EX2 ran = new EX2();
        System.out.println("EX 2: So sanh so ngau nhien");
        ran.dom();
        System.out.println(" ");
        System.out.println(" ");

        EX4 number = new EX4();
        System.out.println("EX 4: So nguyen to");
        number.E_N(); 
        System.out.println(" ");
        System.out.println(" ");

        EX5 in = new EX5();
        System.out.println("EX 5: So nhi phan");
        in.inter();
        System.out.println(" ");
        System.out.println(" ");

        EX7 count2 = new EX7();
        System.out.println("EX 7: Dem den 99 thi stop");
        count2.stop();
        System.out.println(" ");
        System.out.println(" ");

        EX8 case1 = new EX8();
        System.out.println("EX 8: Tao case");
        case1.hello();
        System.out.println(" ");
        System.out.println(" ");

        EX9 fabo = new EX9();
        System.out.println("EX 9: Tim so fabonacsi");
        fabo.fin();
        System.out.println(" ");
        System.out.println(" ");
    }
}
