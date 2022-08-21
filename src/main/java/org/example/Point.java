package org.example;

import java.util.Objects;

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

    public boolean isInSamePlaceOfAs(Point otherPoint) {
        if (this.equals(otherPoint)) return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return north == point.north && east == point.east;
    }

    @Override
    public int hashCode() {
        return Objects.hash(north, east);
    }
}