package com.javaproject.composition.roomAttribute;

public class Paint {
    private String manufacturer, type, color;
    public Paint(String manufacturer, String type, String color) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
