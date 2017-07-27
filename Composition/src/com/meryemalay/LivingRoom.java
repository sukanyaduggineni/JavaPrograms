package com.meryemalay;

public class LivingRoom {

    private Television television;
    private Sofa sofa;
    private int windows;
    private boolean isBalcony;

    public void openTv(){
        television.pressedButton();
    }

    public Sofa getSofa() {
        return sofa;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public LivingRoom(Television television, Sofa sofa, int windows, boolean isBalcony) {
        this.television = television;
        this.sofa = sofa;
        this.windows = windows;
        this.isBalcony = isBalcony;


    }
}
