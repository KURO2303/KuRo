package com.mycompany.app.Week2.Week2Exercise.Interfaces.InterfacesEx11;

class Swap {
    static String swap(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length() - 1; 
        i += 2) {char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            sb.setCharAt(i, c2);
            sb.setCharAt(i + 1, c1);
        }
        return sb.toString();
    }
}
class SwapAdapter implements Processor {
    public String name() {
        return Swap.class.getSimpleName();
    }
    public String process(Object input) {
        return Swap.swap((String)input);
    }
}
public class InterfacesEx11 {
    public static void main(String[] args) {
        Apply.process(new SwapAdapter(), "KURO");
        Apply.process(new SwapAdapter(), "Duc");
    }
}

