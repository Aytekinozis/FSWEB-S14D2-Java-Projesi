package com.workintech.rooms;

public class Ceiling {
    private int height;
    private PaintColor paintedcolor;

    public Ceiling(int height, PaintColor paintedcolor) {
        this.height = height;
        this.paintedcolor = paintedcolor;
    }
    public void create(){
        System.out.println(String.valueOf(height) + paintedcolor);
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", paintedcolor=" + paintedcolor +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedcolor() {
        return paintedcolor;
    }
}
