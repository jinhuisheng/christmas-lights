package christmaslights;


import java.util.function.Consumer;

public class LightGrid {
    private Light[][] lights;

    public LightGrid(int width, int height) {
        lights = new Light[width][height];
        for (int i = 0; i < lights.length; i++) {
            for (int j = 0; j < lights[i].length; j++) {
                lights[i][j] = new Light();
            }
        }
    }

    public LightStatus[][] getLightStatuses() {
        LightStatus[][] statuses = new LightStatus[lights.length][lights[0].length];
        for (int i = 0; i < statuses.length; i++) {
            for (int j = 0; j < statuses[0].length; j++) {
                statuses[i][j] = lights[i][j].getStatus();
            }
        }
        return statuses;
    }

    public void operate(Coordinator start, Coordinator end, Consumer<Light> consumer) {
        for (int i = start.getX(); i <= end.getX(); i++) {
            for (int j = start.getY(); j <= end.getY(); j++) {
                consumer.accept(lights[i][j]);
            }
        }
    }

}
