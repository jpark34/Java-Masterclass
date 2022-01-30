package com.masterclass;

public class Wall {

    private double width;
    private double height;

    public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {

        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;

        if(width < 0) {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        this.height = height;

        if(height < 0) {
            this.height = 0;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }
}
