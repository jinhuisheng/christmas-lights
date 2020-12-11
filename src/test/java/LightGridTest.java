import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/12/11.
 */
public class LightGridTest {

    private LightGrid lightGrid;

    @BeforeEach
    void setUp() {
        lightGrid = new LightGrid(1000, 1000);
    }

    @Test
    void should_all_light_is_close_default_from_0_to_999_on_x_position_success() {
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                assertThat(lightGrid.getLight(i, j).isOpen()).isEqualTo(false);
            }
        }
    }

    @Test
    void should_open_all_light_success() {
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

    @Test
    void should_close_all_light_from_0_to_999_on_x_position_success() {
        Coordinate start = new Coordinate(0, 0);
        Coordinate end = new Coordinate(999, 0);
        CoordinatePairs coordinatePairs = new CoordinatePairs(start, end);
        lightGrid.turnOn(coordinatePairs);

        lightGrid.turnOff(coordinatePairs);

        int j = 0;
        for (int i = 0; i < 1000; i++) {
            assertThat(lightGrid.getLight(i, j).isOpen()).isEqualTo(false);
        }
    }


    @Test
    @Disabled
    void should_switch_all_light_to_close_from_0_to_999_on_x_position_success() {
        Coordinate start = new Coordinate(0, 0);
        Coordinate end = new Coordinate(999, 0);
        CoordinatePairs coordinatePairs = new CoordinatePairs(start, end);
        lightGrid.turnOn(coordinatePairs);

        lightGrid.toggle(coordinatePairs);

        int j = 0;
        for (int i = 0; i < 1000; i++) {
            assertThat(lightGrid.getLight(i, j).isOpen()).isEqualTo(false);
        }
    }


}
