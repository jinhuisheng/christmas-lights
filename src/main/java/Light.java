/**
 * @author huisheng.jin
 * @date 2020/12/11.
 */
public class Light {
    private Integer brightness;

    public Light() {
        brightness = 0;
    }

    public boolean isOpen() {
        return brightness > 0;
    }

    public void on() {
        brightness += 1;
    }

    public void off() {
        if (brightness > 0) {
            brightness -= 1;
        }
    }

    public void toggle() {
        brightness += 2;
    }
}
