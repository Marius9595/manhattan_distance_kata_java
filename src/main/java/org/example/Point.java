package org.example;

public class Point {
    private final int north;
    private final int east;

    public Point(int east, int north) {
        this.north = north;
        this.east = east;

    }

    public int verticalDistanceFrom(Point otherPoint) {
        return this.north + otherPoint.north;
    }

    public int horizontalDistanceFrom(Point otherPoint) {
        return this.east + otherPoint.east;
    }
}