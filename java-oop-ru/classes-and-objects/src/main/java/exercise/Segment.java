package exercise;

import lombok.Getter;

// BEGIN
@Getter
public class Segment {
    private final Point beginPoint;
    private final Point endPoint;
    private final Point midPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
        var midX = (beginPoint.getX() + endPoint.getX()) / 2;
        var midY = (beginPoint.getY() + endPoint.getY()) / 2;
        this.midPoint = new Point(midX, midY);
    }
}
// END
