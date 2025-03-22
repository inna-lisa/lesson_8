package shapes;

import interfaces.Borderable;
import interfaces.Drawable;
import interfaces.Scalable;

import java.awt.*;

abstract class Shape implements Drawable, Borderable, Scalable {
    String name;
    Point startPoint;
    Point finishPoint;
    Color color;
    Color colorBorder;
    double scale;


    public Shape(Point startPoint, Point finishPoint) {
        this.startPoint = startPoint;
        this.finishPoint = finishPoint;
    }


    abstract double getArea();

    @Override
    public Point getStartPoint() {
        return startPoint;
    }

    public Point getFinishPoint() {
        return finishPoint;
    }


}
