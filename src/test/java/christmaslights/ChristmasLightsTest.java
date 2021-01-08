package christmaslights;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static christmaslights.LightStatus.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ChristmasLightsTest {

    private ChristmasLights christmasLights;

    @BeforeEach
    void setUp() {
        christmasLights = new ChristmasLights(10, 10);
    }

    @Test
    void should_init_success() {
        LightStatus[][] statuses = christmasLights.getLightStatuses();
        for (int i = 0; i < statuses.length; i++) {
            for (int j = 0; j < statuses[i].length; j++) {
                assertThat(statuses[i][j]).isEqualTo(CLOSE);
            }
        }

    }

    @Test
    void should_turn_on_all_lights() {
        Coordinator start = new Coordinator(0, 0);
        Coordinator end = new Coordinator(9, 9);
        christmasLights.turnOn(start, end);
        assertStatuses(start, end, OPEN, OPEN);

    }

    @Test
    void should_toggle_all_lights() {
        Coordinator start = new Coordinator(0, 0);
        Coordinator end = new Coordinator(9, 9);
        christmasLights.toggle(start, end);
        assertStatuses(start, end, OPEN, OPEN);
    }

    @Test
    void should_toggle_part_lights() {
        Coordinator start = new Coordinator(0, 0);
        Coordinator end = new Coordinator(9, 0);
        christmasLights.toggle(start, end);
        assertStatuses(start, end, OPEN, CLOSE);

    }

    @Test
    void should_turn_off_part_lights() {
        Coordinator start = new Coordinator(0, 0);
        Coordinator end = new Coordinator(9, 0);
        christmasLights.turnOn(start, end);
        christmasLights.turnOff(start, end);
        assertStatuses(start, end, CLOSE, CLOSE);

    }


    private void assertStatuses(Coordinator start, Coordinator end, LightStatus firstStatus, LightStatus secondStatus) {
        LightStatus[][] lightStatuses = christmasLights.getLightStatuses();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i >= start.getX() && i <= end.getX() && j >= start.getY() && j <= end.getY()) {
                    assertThat(lightStatuses[i][j]).isEqualTo(firstStatus);
                } else {
                    assertThat(lightStatuses[i][j]).isEqualTo(secondStatus);
                }
            }
        }
    }


}
