package org.example;

public class ManhattanDistanceCalculator {
    public int calculate(Point point_1, Point point_2){
        if (point_1.isInSamePlaceOfAs(point_2)){
            return 0;
        }
        return point_1.verticalDistanceFrom(point_2) + point_1.horizontalDistanceFrom(point_2);
    }
}