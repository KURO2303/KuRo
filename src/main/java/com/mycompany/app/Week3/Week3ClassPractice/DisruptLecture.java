package com.mycompany.app.Week3.Week3ClassPractice;

class CellPhone {
    CellPhone() {}
    public void ring(Tune t) {
        t.play();
    }
}

class Tune {
    public void play() {
        System.out.println("Rick roll music kick in");
    }
}

class ObnoxiousTune extends Tune {
    ObnoxiousTune(){}
}

public class DisruptLecture {
    public void hone() {
        CellPhone Phone = new CellPhone();
        Tune T = new Tune();
        ObnoxiousTune Ob = new ObnoxiousTune();
        Phone.ring(T);
        Phone.ring(Ob);
    }
}
