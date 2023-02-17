package com.techelevator;

public class RectangleWall extends Wall{
    private String name,color;
    private int length,height;

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public RectangleWall(String name, String color, int length, int height){
        super(name,color);
        this.height= height;
        this.length = length;

    }
    @Override
    public int getArea(){
        return length * height;
    }


    public String toString(){
        return getName() + " (" + getLength() + "x" + getHeight() + ")" + " rectangle";
    }

}
