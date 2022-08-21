package org.example;

public class ManhattanDistanceCalculator {
    public int calculate(Point point_1, Point point_2){
        return point_1.verticalDistanceFrom(point_2) + point_1.horizontalDistanceFrom(point_2);
    }
}