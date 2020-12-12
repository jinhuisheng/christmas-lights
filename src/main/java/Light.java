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
        return isOpen;
    }

    public void on() {
        this.isOpen = true;
    }

    public void off() {
        this.isOpen = false;
    }

    public void toggle() {
        this.isOpen = !this.isOpen;
    }
}
