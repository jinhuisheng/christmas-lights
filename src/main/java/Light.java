/**
 * @author huisheng.jin
 * @date 2020/12/11.
 */
public class Light {
    private Boolean isOpen;

    public Light() {
        isOpen = false;
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
