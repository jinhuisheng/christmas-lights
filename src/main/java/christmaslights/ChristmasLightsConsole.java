package christmaslights;

public class ChristmasLightsConsole {

    public static void main(String[] args) {
        ChristmasLights christmasLights = new ChristmasLights(1000, 1000);
        /**
         *
         * 对(0,0)到（999,999)做打开操作点亮所有的灯。
         * 对(0,0)到（999,0)做切换操作将影响第一行的灯，关闭的灯打开 ，打开的灯关闭。
         * 对(499,499)到(500,500)做关闭操作，关闭中间的4盏灯。
         */
        christmasLights.turnOn(new CoordinatePair(new Coordinate(0, 0), new Coordinate(999, 999)));
        christmasLights.toggle(new CoordinatePair(new Coordinate(0, 0), new Coordinate(999, 0)));
        christmasLights.toggle(new CoordinatePair(new Coordinate(499, 499), new Coordinate(500, 500)));

        LightStatus[][] lightStatuses = christmasLights.getLightStatuses();
        for (int i = 0; i < lightStatuses.length; i++) {
            for (int j = 0; j < lightStatuses[0].length; j++) {
                System.out.println(String.format("坐标(%s,%s) 灯的状态是%s", i, j, lightStatuses[i][j]));
            }
        }
    }
}
