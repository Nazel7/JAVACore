package com.javaproject.composition.roomAttribute;

public class CurtainHanger {
    private String manufacturer;
    private String type;
    private String color;
    private int curtainNumber;

    public CurtainHanger(String manufacturer, String type, String color, int curtainNumber) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.color = color;
        this.curtainNumber= curtainNumber;
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

    public int getCurtainNumber() {
        return curtainNumber;
    }

}
