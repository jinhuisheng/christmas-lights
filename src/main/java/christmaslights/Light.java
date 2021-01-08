package christmaslights;

import static christmaslights.LightStatus.*;

public class Light {

    private LightStatus status;

    public Light() {
        status = CLOSE;
    }

    public LightStatus getStatus() {
        return status;
    }


    public void turnOn() {
        status = OPEN;
    }

    public void toggle() {
        status = status == OPEN ? CLOSE : OPEN;
    }

    public void turnOff() {
        status = CLOSE;
    }
}
