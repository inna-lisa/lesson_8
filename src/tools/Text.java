package tools;

import interfaces.Scalable;

import java.awt.*;

public class Text extends Tools implements Scalable {

    public static final String name = "TEXT";
    double front;
    double scale;

    protected Text(Point startPoint, Point finishPoint) {
        super(startPoint, finishPoint);
    }

    @Override
    public Point getStartPoint() {
        return super.startPoint;
    }

    @Override
    public Object move(Point movePoint) {
        return new Text(movePoint, new Point((int)(movePoint.getX() + front + 1), (int)(movePoint.getY() + front + 1)));
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public double getScale() {
        return front;
    }

    @Override
    public Object Scale(double scale) {
        this.front = scale;
        return new Text(startPoint, new Point((int) (startPoint.getX() + front + 1), (int)(startPoint.getY() + front + 1)));
    }

    @Override
    public String toString() {
        return name;
    }
}
