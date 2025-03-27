package tools;

import interfaces.Scalable;
import shapes.Utils;
import java.awt.*;

public class Rubber extends Tools implements Scalable {

    public static final String name = "RUBBER";
    double scale;
    double weight = Utils.pointDistance(startPoint.getY(), finishPoint.getY());

    protected Rubber(Point startPoint, Point finishPoint) {
        super(startPoint, finishPoint);
    }

    @Override
    public Point getStartPoint() {
        return startPoint;
    }

    @Override
    public Object move(Point movePoint) {
        return new Rubber(movePoint, new Point((int)(movePoint.getX() + weight), (int)(movePoint.getY() + weight)));
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public double getScale() {
        return scale;
    }

    @Override
    public Object Scale(double scale) {
        this.scale = scale;
        return new Text(startPoint, new Point((int) (startPoint.getX() + (weight * scale)), (int)(startPoint.getY() + (weight * scale))));
    }

    @Override
    public String toString() {
        return name;
    }
}
