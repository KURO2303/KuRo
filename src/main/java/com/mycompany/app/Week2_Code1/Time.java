package com.mycompany.app.Week2_Code1;

public class Time {
    int hour;
    int minute;
    int second;

    public Time() { setTime(0, 0, 0); }
    public Time(int h) { setTime(h, 0, 0); }
    public Time(int h, int m) { setTime(h, m, 0); }
    public Time(int h, int m, int s) { setTime(h, m, s); }
    
    Time setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
        return this;
    }

    Time setHour(int h) {
        hour = (( h >= 0 && h < 24 ) ? h : 0 );
        return this;
    }

    Time setMinute(int m) {
        minute = (( m >= 0 && m < 60 ) ? m : 0 );
        return this;
    }
    
    Time setSecond(int s) {
        second = ((s >= 0 && s < 24 ) ? s : 0 );
        return this;
    }

    public String TimeOn(){
        return hour + ":" + minute +":"+second;
    }
}
