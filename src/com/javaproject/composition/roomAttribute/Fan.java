package com.javaproject.composition.roomAttribute;

public class Fan {
    private String manufacturer, type, color;
    private boolean isPowerUp;

    public Fan(String manufacturer, String type, String color, boolean isPowerUp) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.color = color;
        this.isPowerUp = isPowerUp;
    }


    public void fanPowerUp(int number) {
        if (isPowerUp && number == 1) {
            System.out.println("The " + manufacturer + " fan is ON and in number " + number);
        } else if (isPowerUp && number == 2) {
            System.out.println("The " + manufacturer + " fan is ON and in number " + number);
        } else if (isPowerUp && number == 3) {
            System.out.println("The " + manufacturer + " fan is ON and in number " + number);
        } else if (isPowerUp && number == 4) {
            System.out.println("The " + manufacturer + " fan is ON and in number " + number);
        } else if (isPowerUp && number == 5) {
            System.out.println("The " + manufacturer + " fan is ON and in number " + number);
        } else System.out.println("The " + manufacturer + " AC is OFF.");
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
