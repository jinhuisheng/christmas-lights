

/**
 * @author huisheng.jin
 * @date 2020/12/11.
 */
public class LightGrid {
    private Light[][] lights;

    public LightGrid(int x, int y) {
        lights = new Light[1000][1000];
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                lights[i][j] = new Light();
            }
        }

    }


    public void turnOn(CoordinatePairs coordinatePairs) {

    }

    public Light getLight(int i, int j) {
        return new Light();
    }
}
