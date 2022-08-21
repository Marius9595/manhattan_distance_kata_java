import org.example.Point;

import java.util.Random;

public class PointMother {
    public static Point generateOne(){
        int randonNorth = new Random().nextInt();
        int randomEast = new Random().nextInt();
        return new Point(randomEast,randonNorth);
    }
}