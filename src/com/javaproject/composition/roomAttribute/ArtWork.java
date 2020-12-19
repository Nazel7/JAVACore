package com.javaproject.composition.roomAttribute;

public class ArtWork {
    private String producer, type, design;
    private int artNumbers;

    public ArtWork(String producer, String type, String design, int artNumbers) {
        this.producer = producer;
        this.type = type;
        this.design = design;
        this.artNumbers = artNumbers;
    }

    public String getProducer() {
        return producer;
    }

    public String getType() {
        return type;
    }

    public String getDesign() {
        return design;
    }

    public int getArtnumbers() {
        return artNumbers;
    }
}
