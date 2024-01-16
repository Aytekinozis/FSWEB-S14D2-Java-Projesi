package com.workintech.rooms;

public class Wall {
    private String direction;

    public String getDirection() {
        return direction;
    }

    public void create(){
        System.out.println(direction);
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }

    public Wall(String direction) {
        this.direction = direction;
    }
}
