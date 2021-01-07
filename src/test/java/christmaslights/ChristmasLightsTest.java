package christmaslights;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;


public class ChristmasLightsTest {

    private ChristmasLights christmasLights;
    private int length;
    private int width;

    @BeforeEach
    void setUp() {
        length = 10;
        width = 10;
        christmasLights = new ChristmasLights(length, width);
    }

    @Test
    void should_init_success() {
        ChristmasLights christmasLights = new ChristmasLights(10, 10);
        Integer[][] brightnesses = christmasLights.getBrightnesses();
        for (Integer[] brightnessLine : brightnesses) {
            for (Integer brightness : brightnessLine) {
                assertThat(brightness).isEqualTo(0);
            }
        }
    }

    @Test
    void should_turn_on_all_lights() {
        Coordinate start = new Coordinate(0, 0);
        Coordinate end = new Coordinate(9, 9);
        christmasLights.turnOn(start, end);
        assertStatuses(start, end, 1, 0);
    }

    @Test
    void should_turn_on_part_lights() {
        Coordinate start = new Coordinate(0, 0);
        Coordinate end = new Coordinate(9, 0);
        christmasLights.turnOn(start, end);
        assertStatuses(start, end, 1, 0);
    }

    @Test
    void should_toggle_part_lights() {
        Coordinate start = new Coordinate(0, 0);
        Coordinate end = new Coordinate(9, 0);
        christmasLights.toggle(start, end);

        assertStatuses(start, end, 2, 0);
    }

    @Test
    void should_toggle_part_lights_twice() {
        Coordinate start = new Coordinate(0, 0);
        Coordinate end = new Coordinate(9, 0);
        christmasLights.toggle(start, end);
        christmasLights.toggle(start, end);

        assertStatuses(start, end, 4, 0);
    }

    @Test
    void should_turn_off_part_lights_twice() {
        Coordinate start = new Coordinate(0, 0);
        Coordinate end = new Coordinate(9, 0);
        christmasLights.turnOn(start, end);
        christmasLights.turnOff(start, end);
        christmasLights.turnOff(start, end);

        assertStatuses(start, end, 0, 0);
    }


    private void assertStatuses(Coordinate start, Coordinate end,
                                Integer brightness1, Integer brightness2) {
        Integer[][] brightnesses = christmasLights.getBrightnesses();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (i >= start.getX() && i <= end.getX() && j >= start.getY() && j <= end.getY()) {
                    assertThat(brightnesses[i][j]).isEqualTo(brightness1);
                } else {
                    assertThat(brightnesses[i][j]).isEqualTo(brightness2);
                }
            }
        }

    }


}
