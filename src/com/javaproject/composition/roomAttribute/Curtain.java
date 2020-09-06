package com.javaproject.composition.roomAttribute;

public class Curtain {
    private String manufacturer;
    private String type;
    private String color;
    private CurtainHanger theCurtainHanger;

    public Curtain(String manufacturer, String type, String color, CurtainHanger theCurtainHanger) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.color = color;
        this.theCurtainHanger = theCurtainHanger;
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

    public CurtainHanger getTheCurtainHanger() {
        return theCurtainHanger;
    }
}
