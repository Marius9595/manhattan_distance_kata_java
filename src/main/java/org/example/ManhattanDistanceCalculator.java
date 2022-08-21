package org.example;

public class ManhattanDistanceCalculator {
    public int calculate(Point point_1, Point point_2){
        if (areInSamePlace(point_1,point_2)){
            return 0;
        }
        return point_1.verticalDistanceFrom(point_2) + point_1.horizontalDistanceFrom(point_2);
    }
    private boolean areInSamePlace(Point point_1, Point point_2) {
        return point_1.equals(point_2);
    }
}