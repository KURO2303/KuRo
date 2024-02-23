/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app.New_Folder;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 2;
        n2.i = 5;
        n1.i = n2.i;
        n2.i = 10;	
        System.out.println(n2.i);
        System.out.println(n1.i);

        //assignment 2

        n1.i = 2;
        n2.i = 5;
        n1 = n2;
        System.out.println(n1.i);
        System.out.println(n2.i);
        System.out.println("\n");

        n2.i = 10;
        System.out.println(n1.i);
        System.out.println(n2.i);
        System.out.println("\n");

        n1.i = 20;
        System.out.println(n1.i);
        System.out.println(n2.i);
        System.out.println("\n");


    }
}