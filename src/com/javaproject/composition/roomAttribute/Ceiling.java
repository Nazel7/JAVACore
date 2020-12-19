package com.javaproject.composition.roomAttribute;

public class Ceiling {
    private Bulb theBulb;
    private Fan theFan;

    public Ceiling(Bulb theBulb, Fan theFan) {
        this.theBulb = theBulb;
        this.theFan = theFan;
    }

    public Bulb getBulb() {
        return theBulb;
    }

    public Fan getFan() {
        return theFan;
    }
}
