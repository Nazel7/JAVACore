package com.javaproject.composition.roomAttribute;

public class Bed {
    private String producer;
    private String type;
    private int form;

    public Bed(String producer, String type, int form) {
        this.producer = producer;
        this.type = type;
        this.form = form;
    }

    public String getProducer() {
        return producer;
    }

    public String getType() {
        return type;
    }

    public int getForm() {
        return form;
    }
}
