package christmaslights;

public class ChristmasLights {

    private final LightGrid lightGrid;

    public ChristmasLights(int length, int width) {
        lightGrid = new LightGrid(length, width);
    }

    public Integer[][] getBrightnesses() {
        return lightGrid.getBrightnesses();
    }

    public void turnOn(Coordinate start, Coordinate end) {
        lightGrid.operate(start, end, Light::turnOn);
    }

    public void toggle(Coordinate start, Coordinate end) {
        lightGrid.operate(start, end, Light::toggle);
    }

    public void turnOff(Coordinate start, Coordinate end) {
        lightGrid.operate(start, end, Light::turnOff);
    }

}
