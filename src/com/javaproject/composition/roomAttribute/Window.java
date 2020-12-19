package com.javaproject.composition.roomAttribute;

public class Window {
    private Curtain curtain;
    private CurtainHanger curtainHanger;

    public Window(Curtain curtain, CurtainHanger curtainHanger) {
        this.curtain = curtain;
        this.curtainHanger = curtainHanger;
    }

    public CurtainHanger getCurtainHanger() {
        return curtainHanger;
    }

    public Curtain getCurtain() {
        return curtain;
    }
}
