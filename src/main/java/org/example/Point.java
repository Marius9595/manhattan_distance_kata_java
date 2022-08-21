package org.example;

public class Point {
    private final int north;
    private final int east;

    public Point(int east, int north) {
        this.north = north;
        this.east = east;
    }

    public int verticalDistanceFrom(Point otherPoint) {
        return Math.abs(this.north) + Math.abs(otherPoint.north);
    }

    public int horizontalDistanceFrom(Point otherPoint) {
        return Math.abs(this.east) + Math.abs(otherPoint.east);
    }
}