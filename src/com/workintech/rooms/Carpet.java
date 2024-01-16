package com.workintech.rooms;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }
}
