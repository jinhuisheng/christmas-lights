/**
 * @author huisheng.jin
 * @date 2020/12/11.
 */
public class Light {
    private Boolean isOpen;

    public boolean isOpen() {
        return true;
    }

    public void on() {
        this.isOpen = true;
    }

    public void off() {
        this.isOpen = false;
    }
}
