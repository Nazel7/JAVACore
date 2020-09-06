package com.javaproject.composition.roomAttribute;

public class Wall1 {
    private Bulb bulb;
    private Paint paint;
    private com.javaproject.composition.roomAttribute.AirConditional AirConditional;
    private com.javaproject.composition.roomAttribute.CurtainHanger CurtainHanger;
    private com.javaproject.composition.roomAttribute.Curtain Curtain;
    private com.javaproject.composition.roomAttribute.ArtWork ArtWork;
    private int cubBoard;
    private Television Television;

    public Wall1(Bulb bulb, Paint paint, AirConditional airConditional, CurtainHanger curtainHanger, Curtain curtain,
                 ArtWork artWork, Television television) {
        this.bulb = bulb;
        this.paint = paint;
        AirConditional = airConditional;
        CurtainHanger = curtainHanger;
        Curtain = curtain;
        ArtWork = artWork;
        this.cubBoard = 2;
        Television = television;
    }

    public Bulb getBulb() {
        return bulb;
    }

    public Paint getPaint() {
        return paint;
    }

    public AirConditional getAirConditional() {
        return AirConditional;
    }

    public CurtainHanger getCurtainHanger() {
        return CurtainHanger;
    }

    public Curtain getCurtain() {
        return Curtain;
    }

    public ArtWork getArtWork() {
        return ArtWork;
    }

    public int getCubboard() {
        return cubBoard;
    }

    public Television getTelevision() {
        return Television;
    }
}
