package com.masterclass;

import java.lang.Math;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt( Math.pow(0 - getX(), 2) + Math.pow(0 - getY(), 2) );
    }

    public double distance(int x, int y) {
        return Math.sqrt( Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2) );
    }

    public double distance(Point point) {
        return Math.sqrt( Math.pow(point.getX() - getX(), 2) + Math.pow(point.getY() - getY(), 2) );
    }
}
