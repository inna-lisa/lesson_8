package tools;

import java.awt.*;

public class Pencil extends Tools {

    protected Pencil(Point startPoint, Point finishPoint) {
        super(startPoint, finishPoint);
    }

    @Override
    public Point getStartPoint() {
        return null;
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
