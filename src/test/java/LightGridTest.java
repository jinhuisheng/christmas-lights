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
        int totalBrightness = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                assertThat(lightGrid.getLight(i, j).isOpen()).isEqualTo(false);
                totalBrightness += lightGrid.getLight(i, j).getBrightness();
            }
        }
        assertThat(totalBrightness).isEqualTo(0);
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

        int j = 0;
        for (int i = 0; i < 1000; i++) {
            Light currentLight = lightGrid.getLight(i, j);
            if (i % 2 != 0) {
                currentLight.on();
            }
        }

        lightGrid.toggle(coordinatePairs);

        for (int i = 0; i < 1000; i++) {
            Light currentLight = lightGrid.getLight(i, j);
            if (i % 2 == 0) {
                assertThat(currentLight.isOpen()).isEqualTo(true);
            } else {
                assertThat(currentLight.isOpen()).isEqualTo(false);
            }
        }
    }

    @Test
    void xxx() {
        Coordinate start = new Coordinate(499, 499);
        Coordinate end = new Coordinate(500, 500);
        CoordinatePairs coordinatePairs = new CoordinatePairs(start, end);

        for (int i = 499; i <= 500; i++) {
            for (int j = 499; j < 500; j++) {
                lightGrid.getLight(i, j).on();
            }
        }

        lightGrid.turnOff(coordinatePairs);

        for (int i = 499; i <= 500; i++) {
            for (int j = 499; j < 500; j++) {
                assertThat(lightGrid.getLight(i, j).isOpen()).isEqualTo(false);
            }
        }

    }


}
