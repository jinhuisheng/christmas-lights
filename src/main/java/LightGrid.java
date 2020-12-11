

/**
 * @author huisheng.jin
 * @date 2020/12/11.
 */
public class LightGrid {
    private Light[][] lights;

    public LightGrid(int x, int y) {
        lights = new Light[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                lights[i][j] = new Light();
            }
        }

    }


    public void turnOn(CoordinatePairs coordinatePairs) {
        Coordinate start = coordinatePairs.getStartCoordinate();
        Coordinate end = coordinatePairs.getEndCoordinate();
        for (int i = start.getX(); i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                lights[i][j].on();
            }
        }

    }

    public Light getLight(int i, int j) {
        return lights[i][j];
    }
}
