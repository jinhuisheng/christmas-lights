package christmaslights;

public class ChristmasLights {

    private LightGrid lightGrid;

    public ChristmasLights(int x, int y) {
        lightGrid = new LightGrid(x, y);
    }

    public LightStatus[][] getLightStatuses() {
        return lightGrid.getLightStatuses();
    }


    public void turnOn(Coordinator start, Coordinator end) {
        lightGrid.operate(start, end, Light::turnOn);
    }

    public void toggle(Coordinator start, Coordinator end) {
        lightGrid.operate(start, end, Light::toggle);
    }

    public void turnOff(Coordinator start, Coordinator end) {
        lightGrid.operate(start, end, Light::turnOff);
    }
}
