package christmaslights;

public class ChristmasLightsConsole {
    public static void main(String[] args) {
        ChristmasLights christmasLights = new ChristmasLights(1000, 1000);
        christmasLights.turnOn(new Coordinate(0, 0), new Coordinate(999, 999));
        christmasLights.toggle(new Coordinate(0, 0), new Coordinate(999, 0));
        christmasLights.turnOff(new Coordinate(499, 499), new Coordinate(500, 500));
        printBrightnesses(christmasLights);
    }

    private static void printBrightnesses(ChristmasLights christmasLights) {
        Integer[][] lightStatuses = christmasLights.getBrightnesses();
        for (int i = 0; i < lightStatuses.length; i++) {
            for (int j = 0; j < lightStatuses[i].length; j++) {
                System.out.println(String.format("坐标(%s,%s)灯亮度：%s", i, j, lightStatuses[i][j]));
            }
        }
    }
}
