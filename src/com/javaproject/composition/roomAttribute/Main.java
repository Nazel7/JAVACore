package com.javaproject.composition.roomAttribute;

public class Main {
    public static void main(String[] args) {
//        com.javaproject.functionControl.SpeedCoverter.printConversion(0.0);
//        boolean teen =com.javaproject.functionControl.TeenCalculator.hasTeen(12, 123, 23);
//        boolean teen1= com.javaproject.functionControl.TeenCalculator.isTeen(19);
//        System.out.println(teen1);
        Bed myBed= new Bed("Muca form", "12 by 12", 1 );
        Bulb myBulb= new Bulb("Faraday", "Yellow", "Screw" );
        Fan myFan= new Fan("Ole","CompositionRoomAttribute.Ceiling CompositionRoomAttribute.Fan", "Brown", true);
        AirConditional myAir= new AirConditional("Plantinum", "White", true);
        CurtainHanger myCurtainHanger= new CurtainHanger("AB Company", "Original","Black", 3 );
        Curtain myCurtain= new Curtain("AB Company", "Rayon Flower", "Rayon-Brown",myCurtainHanger );
        Door myDoor= new Door("Securities", myCurtain, myCurtainHanger, true);
        Window myWindow= new Window(myCurtain, myCurtainHanger);
        Ceiling theCeiling= new Ceiling(myBulb, myFan);
        ArtWork myArtwotk= new ArtWork("Segun", "Imagination", "MUltiples", 2);
        Paint myPaint= new Paint("Lara CompositionRoomAttribute.Paint", "Stone", "Green and Purple");
        Television myTelevision= new Television("Hensen", "Flat Screen 52 Inches", "Black", true);
        Wall1 myWall= new Wall1(myBulb, myPaint, myAir, myCurtainHanger, myCurtain, myArtwotk, myTelevision);
        FloorRoom theFloor= new FloorRoom(myBed);
        Room myRoom= new Room(theCeiling, myWall, theFloor, myWindow, myDoor);
        myRoom.getCeiling().getFan().fanPowerUp(1);
        myRoom.getDoor().doorOpen();
        myRoom.getWall1().getAirConditional().powerUp(-1);

    }
}
