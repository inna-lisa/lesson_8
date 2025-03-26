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

    public Shape(Shape shape){
        this.name = shape.name;
    }

    abstract double getArea();

    @Override
    public Point getStartPoint() {
        return startPoint;
    }

    public Point getFinishPoint() {
        return finishPoint;
    }

    public void getName (){
        System.out.println("Shape is " + this);
    }
}
