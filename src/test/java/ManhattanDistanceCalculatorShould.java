import org.example.ManhattanDistanceCalculator;
import org.example.Point;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/*
(0,0),(0,0) -> 0
(0,0),(0,1) -> 1
(0,0),(1,0) -> 1
(0,0),(1,1) -> 2
(-1,0),(0,0) -> 1
(-1,0),(1,0) -> 2
*/

public class ManhattanDistanceCalculatorShould {
    private ManhattanDistanceCalculator calculator;
    @Before
    public void setUp(){
        calculator = new ManhattanDistanceCalculator();
    }
    @Test
    public void not_calculate_distance_with_points_located_in_same_place(){
        assertThat(calculator.calculate(new Point(0,0), new Point(0,0))).isEqualTo(0);
    }
    @Test
    public void sum_vertical_distances(){
        assertThat(calculator.calculate(new Point(0,0), new Point(0,1))).isEqualTo(1);
    }
    @Test
    public void sum_horizontal_distances(){
        assertThat(calculator.calculate(new Point(0,0), new Point(1,0))).isEqualTo(1);
    }
}