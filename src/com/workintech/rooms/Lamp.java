package com.workintech.rooms;

public class Lamp {
    private boolean battery;
    private int globRating;
    private LambType style;

    public Lamp(boolean battery, int globRating, LambType style) {
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "battery=" + battery +
                ", globRating=" + globRating +
                ", style=" + style +
                '}';
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

    public LambType getStyle() {
        return style;
    }
    public boolean isBattery(){
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
