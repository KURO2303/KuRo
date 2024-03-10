package com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx11;

public class Apply {
    public static void process(Processor p, Object s) {
    System.out.println("Using Processor " + p.name());
    System.out.println(p.process(s));
    }
   }