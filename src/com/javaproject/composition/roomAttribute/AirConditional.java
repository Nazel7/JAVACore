package com.javaproject.composition.roomAttribute;

public class AirConditional {
    private String manufacturer;
    private String color;
    private boolean isRemotePress;

    public AirConditional(String manufacturer, String color, boolean isRemotePress) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.isRemotePress = isRemotePress;
    }
    public void powerUp(int degree){
        if (isRemotePress && degree>= 0 && degree <= 16){
            System.out.println("The " + manufacturer + " AC is ON and the room is very cold with " + degree + "_degree in reduced position " );
        }
        if (isRemotePress && degree>= 17 && degree <= 20){
            System.out.println("The " + manufacturer + " AC is ON and the room is moderately cold with " + degree + "_degree in reduced position " );
        }
        if (isRemotePress && degree> 20 && degree <= 27){
            System.out.println("The " + manufacturer + " AC is ON and the room is in normal temperature with " + degree + "_degree in neutral position " );
        }
        else if( isRemotePress && degree >27) {System.out.println("The " + manufacturer + " AC is ON and the room is hot with " + degree + "_degree in high position");
        }
        else System.out.println("The " + manufacturer + " AC is OFF." );
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

}
