package christmaslights;

public class CoordinatePair {
    private final Coordinate start;
    private final Coordinate end;

    public CoordinatePair(Coordinate start, Coordinate end) {
        this.start = start;
        this.end = end;
    }

    public int getStartX() {
        return start.getX();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getStartY() {
        return start.getY();
    }

    public int getEndY() {
        return end.getY();
    }
}
