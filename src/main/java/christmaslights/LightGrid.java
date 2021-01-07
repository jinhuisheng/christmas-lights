package christmaslights;

import java.util.function.Consumer;

public class LightGrid {

    private final Light[][] lights;

    public LightGrid(int length, int width) {
        lights = new Light[length][width];
        for (Light[] lightLine : lights) {
            for (int i = 0; i < lightLine.length; i++) {
                lightLine[i] = new Light();
            }
        }
    }

    public Integer[][] getBrightnesses() {
        Integer[][] brightnesses = new Integer[lights.length][lights[0].length];
        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[i].length; j++) {
                brightnesses[i][j] = lights[i][j].getBrightness();
            }
        }
        return brightnesses;
    }

    public void operate(Coordinate start, Coordinate end, Consumer<Light> consumer) {
        for (int i = start.getX(); i <= end.getX(); i++) {
            for (int j = start.getY(); j <= end.getY(); j++) {
                consumer.accept(lights[i][j]);
            }
        }
    }

}
