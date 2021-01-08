package christmaslights;

import java.util.function.Consumer;

public class LightGrid {
    private Light[][] lights;

    public LightGrid(int x, int y) {
        lights = new Light[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                lights[i][j] = new Light();
            }
        }

    }

    public LightStatus[][] getLightStatuses() {
        LightStatus[][] lightStatuses = new LightStatus[lights.length][lights[0].length];
        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[0].length; j++) {
                lightStatuses[i][j] = lights[i][j].getStatus();
            }
        }
        return lightStatuses;
    }

    public void operate(CoordinatePair coordinatePair, Consumer<Light> consumer) {
        for (int i = coordinatePair.getStartX(); i <= coordinatePair.getEndX(); i++) {
            for (int j = coordinatePair.getStartY(); j <= coordinatePair.getEndY(); j++) {
                consumer.accept(lights[i][j]);
            }
        }
    }

}
