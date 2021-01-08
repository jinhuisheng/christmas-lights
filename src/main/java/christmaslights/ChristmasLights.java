package christmaslights;

public class ChristmasLights {
    private LightGrid lightGrid;

    public ChristmasLights(int x, int y) {
        lightGrid = new LightGrid(x, y);
    }

    public LightStatus[][] getLightStatuses() {
        return lightGrid.getLightStatuses();
    }


    public void turnOn(CoordinatePair coordinatePair) {
        lightGrid.operate(coordinatePair, Light::turnOn);
    }

    public void toggle(CoordinatePair coordinatePair) {
        lightGrid.operate(coordinatePair, Light::toggle);
    }

    public void turnOff(CoordinatePair coordinatePair) {
        lightGrid.operate(coordinatePair, Light::turnOff);
    }
}
