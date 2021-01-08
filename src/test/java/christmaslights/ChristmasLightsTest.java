package christmaslights;

import org.junit.jupiter.api.Test;

import static christmaslights.LightStatus.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ChristmasLightsTest {
    @Test
    void should_init_success() {
        ChristmasLights christmasLights = new ChristmasLights(10, 10);
        LightStatus[][] lightStatuses = christmasLights.getLightStatuses();
        assertLights(lightStatuses, CLOSE);
    }

    @Test
    void turn_on_all_the_light() {
        ChristmasLights christmasLights = new ChristmasLights(10, 10);
        christmasLights.turnOn(new CoordinatePair(new Coordinate(0, 0), new Coordinate(9, 9)));
        LightStatus[][] lightStatuses = christmasLights.getLightStatuses();

        assertLights(lightStatuses, OPEN);
    }

    @Test
    void turn_on_part_light() {
        ChristmasLights christmasLights = new ChristmasLights(10, 10);
        CoordinatePair coordinatePair = new CoordinatePair(new Coordinate(0, 0), new Coordinate(9, 0));
        christmasLights.turnOn(coordinatePair);
        LightStatus[][] lightStatuses = christmasLights.getLightStatuses();

        assertLights(lightStatuses, coordinatePair);
    }

    @Test
    void toggle_part_light() {
        ChristmasLights christmasLights = new ChristmasLights(10, 10);
        CoordinatePair coordinatePair = new CoordinatePair(new Coordinate(0, 0), new Coordinate(9, 0));
        christmasLights.toggle(coordinatePair);
        LightStatus[][] lightStatuses = christmasLights.getLightStatuses();

        assertLights(lightStatuses, coordinatePair);
    }

    @Test
    void turn_off_part_light() {
        ChristmasLights christmasLights = new ChristmasLights(10, 10);
        Coordinate start = new Coordinate(0, 0);
        Coordinate end = new Coordinate(9, 0);
        christmasLights.turnOn(new CoordinatePair(start, end));
        christmasLights.turnOff(new CoordinatePair(start, end));
        LightStatus[][] lightStatuses = christmasLights.getLightStatuses();

        assertLights(lightStatuses, CLOSE);
    }

    @Test
    void strong_test() {
        ChristmasLights christmasLights = new ChristmasLights(1000, 1000);
        christmasLights.turnOn(new CoordinatePair(new Coordinate(0, 0), new Coordinate(999, 999)));
        christmasLights.toggle(new CoordinatePair(new Coordinate(0, 0), new Coordinate(999, 0)));
        christmasLights.turnOff(new CoordinatePair(new Coordinate(499, 499), new Coordinate(500, 500)));
        LightStatus[][] lightStatuses = christmasLights.getLightStatuses();
        assertThat(lightStatuses[499][499]).isEqualTo(CLOSE);
        assertThat(lightStatuses[499][500]).isEqualTo(CLOSE);
        assertThat(lightStatuses[500][499]).isEqualTo(CLOSE);
        assertThat(lightStatuses[500][500]).isEqualTo(CLOSE);
        assertThat(lightStatuses[498][498]).isEqualTo(OPEN);
        assertThat(lightStatuses[1][0]).isEqualTo(CLOSE);
        assertThat(lightStatuses[0][1]).isEqualTo(OPEN);


    }

    private void assertLights(LightStatus[][] lightStatuses, LightStatus close) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertThat(lightStatuses[i][j]).isEqualTo(close);
            }
        }
    }

    private void assertLights(LightStatus[][] lightStatuses, CoordinatePair coordinatePair) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (isInCoordinatePair(coordinatePair, i, j)) {
                    assertThat(lightStatuses[i][j]).isEqualTo(OPEN);
                } else {
                    assertThat(lightStatuses[i][j]).isEqualTo(CLOSE);
                }
            }
        }
    }

    private boolean isInCoordinatePair(CoordinatePair coordinatePair, int i, int j) {
        return i >= coordinatePair.getStartX() && i <= coordinatePair.getEndX()
                && j >= coordinatePair.getStartY() && j <= coordinatePair.getEndY();
    }

}
