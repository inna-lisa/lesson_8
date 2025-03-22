package tools;

import java.awt.*;

public class Board extends Tools{

    public static final String name = "BOARD";

    protected Board(Point startPoint, Point finishPoint) {
        super(startPoint, finishPoint);
    }

    @Override
    public Point getStartPoint() {
        return startPoint;
    }

    @Override
    public Object move(Point movePoint) {
        return null;
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
