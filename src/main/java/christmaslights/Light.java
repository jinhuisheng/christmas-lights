package christmaslights;


public class Light {
    private Integer brightness;

    public Light() {
        brightness = 0;
    }

    public void turnOn() {
        brightness += 1;
    }

    public void toggle() {
        brightness += 2;
    }

    public void turnOff() {
        if (brightness > 0) {
            brightness -= 1;
        }
    }

    public Integer getBrightness() {
        return brightness;
    }
}
