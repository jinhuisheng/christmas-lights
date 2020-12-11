import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/12/11.
 */
public class LightGridTest {
    @Test
    void should_open_all_light_success() {
        LightGrid lightGrid = new LightGrid(1000,1000);
        Coordinate start = new Coordinate(0, 0);
        Coordinate end = new Coordinate(999, 999);
        CoordinatePairs coordinatePairs = new CoordinatePairs(start, end);

        lightGrid.turnOn(coordinatePairs);

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                assertThat(lightGrid.getLight(i, j).isOpen()).isEqualTo(true);
            }
        }
    }
}
