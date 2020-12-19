package com.javaproject.composition.roomAttribute;

public class Door {
    private String manufacturer, doorType;
    private Curtain theCurtain;
    private CurtainHanger theCurtainHanger;
    private boolean isOpen;
    public Door(String manufacturer, Curtain curtain, CurtainHanger curtainHanger, boolean isOpen) {
        this.manufacturer = manufacturer;
        this.doorType = "Security CompositionRoomAttribute.Door";
        this.theCurtain = curtain;
        this.theCurtainHanger = curtainHanger;
        this.isOpen = isOpen;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDoorType() {
        return doorType;
    }

    public Curtain getTheCurtin() {
        return theCurtain;
    }

    public CurtainHanger getCurtainHanger() {
        return theCurtainHanger;
    }

    public  void doorOpen() {
        if(isOpen){
            System.out.println(" The door is OPEN");
        }
        else System.out.println(" The door is CLOSE");
    }
}
