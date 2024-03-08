package com.mycompany.app.Week2.Week2Exercise.ReusingClasses;

class KuroA{
    KuroA(){
        System.out.println("KuroA");
    }
}
class KuroB extends KuroA{
    KuroB(){
        System.out.println("KuroB");
    }
    public static KuroB Kurob(){
        return new KuroB();
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        KuroB a = new KuroB();
        @SuppressWarnings("unused")
        KuroB b = new KuroB();
    }
}
class KuroC extends KuroB{
    KuroC(){
        System.out.println("KuroC");
    }
}
class KuroD extends KuroC{
    KuroD(){
        System.out.println("KuroD");
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        KuroD c = new KuroD();
        KuroB.main(args);
    }
}

