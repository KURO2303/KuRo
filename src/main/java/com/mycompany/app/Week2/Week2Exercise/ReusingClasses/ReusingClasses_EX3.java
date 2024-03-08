package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class rock{
    rock(){
        System.out.print("Cris is playing");
    }
}
class paper extends rock{
    paper(){
        System.out.print(" rock paper scissor with Peko");
    }
}
class scissor extends paper{
    scissor(){
        System.out.print(" and Peko lose");
    }
}
public class ReusingClasses_EX3 {
public static void main(String[] args) {
    @SuppressWarnings("unused") //add this because i don't want to see error :P
    scissor x = new scissor();
}
}