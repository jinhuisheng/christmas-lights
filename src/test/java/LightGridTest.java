import org.junit.jupiter.api.Test;

/**
 * @author huisheng.jin
 * @date 2020/12/11.
 */
public class LightGridTest {
    @Test
    void should_open_all_light_success() {
        LightGrid lightGrid = new LightGrid();
        Coordinate start = new Coordinate(0, 0);
        Coordinate end = new Coordinate(999, 999);
        CoordinatePairs coordinatePairs = new CoordinatePairs(start, end);
        lightGrid.turnOn(coordinatePairs);

        fo
    }
}
