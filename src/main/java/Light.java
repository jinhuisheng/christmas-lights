/**
 * @author huisheng.jin
 * @date 2020/12/11.
 */
public class Light {
    private Boolean isOpen;
    private Integer brightness;

    public Light() {
        isOpen = false;
        brightness = 0;
    }

    public boolean isOpen() {
        return brightness > 0;
    }

    public void on() {
        brightness += 1;
        this.isOpen = true;
    }

    public void off() {
        if (brightness > 0) {
            brightness -= 1;
        }
        this.isOpen = false;
    }

    public void toggle() {
        brightness += 2;
        this.isOpen = !this.isOpen;
    }
}
