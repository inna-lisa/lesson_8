package tools;

import java.awt.*;

public class Arrow extends Tools {

    public static final String name = "ARROW";
    public double length = Point.distance(startPoint.getX(),startPoint.getY(), finishPoint.getX(), finishPoint.getY());

    protected Arrow(Point startPoint, Point finishPoint) {
        super(startPoint, finishPoint);
    }

    public double getLength() {
        return length;
    }

    @Override
    public Point getStartPoint() {
        return super.startPoint;
    }

    @Override
    public Point getFinishPoint() {
        return super.getFinishPoint();
    }

    @Override
    public Object move(Point movePoint) {
        return new Line(movePoint, finishPoint);
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
