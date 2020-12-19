package com.javaproject.composition.roomAttribute;

public class Television {
    private String manufacturer;
    private String type;
    private String color;
    private boolean isRemotePress;

    public Television(String manufacturer, String type, String color, boolean isRemotePress) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.color = color;
        this.isRemotePress = isRemotePress;
    }
    public void powerUp(){
        if (isRemotePress){
            System.out.println("The " + manufacturer + " AC is ON."  );
        }
        else System.out.println("The " + manufacturer + " AC is OFF."  );
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

    public boolean isPowerUp() {
        return isRemotePress;
    }
}
