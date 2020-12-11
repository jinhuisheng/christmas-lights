/**
 * @author huisheng.jin
 * @date 2020/12/11.
 */
public class CoordinatePairs {
    private final Coordinate start;
    private final Coordinate end;

    public CoordinatePairs(Coordinate start, Coordinate end) {

        this.start = start;
        this.end = end;
    }

    public Coordinate getStartCoordinate() {
        return start;
    }

    public Coordinate getEndCoordinate() {
        return end;
    }
}
