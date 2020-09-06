package com.javaproject.composition.roomAttribute;

public class Bulb {
    private String manufacturer;
    private String color;
    private String bottomType;

    public Bulb(String manufacturer, String color, String type) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.bottomType = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return bottomType;
    }
}
