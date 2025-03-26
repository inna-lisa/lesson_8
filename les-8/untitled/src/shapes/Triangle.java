package shapes;

import java.awt.*;

public class Triangle extends Shape {

    double height = Utils.pointDistance(startPoint.getY(), finishPoint.getY());
    double sideC = Utils.pointDistance(startPoint.getX(), finishPoint.getX()) * 2;
    double sideA = Utils.hypotenuse(height, sideC / 2);
    double sideB = sideA;
    public static final String name = "TRIANGLE";
    double scale;

    public Triangle(Point startPoint, Point finishPoint) {
        super(startPoint, finishPoint);
    }

    public double getHeight() {
        return height;
    }

    public double getSideC() {
        return sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return sideC * height / 2;
    }

    @Override
    public double getBorderWidht() {
        return 0;
    }

    @Override
    public Color getBorderColor() {
        return null;
    }

    @Override
    public Point getStartPoint() {
        return startPoint;
    }

    @Override
    public Object move(Point movePoint) {
        return new Triangle(movePoint, new Point((int)(movePoint.getX() + (sideC / 2)), (int)(movePoint.getY() + height)));
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
        return new Triangle(startPoint, new Point( (int)(startPoint.getX() + (sideC / 2 * scale)),(int)(startPoint.getY() + (height * scale))));
    }

    @Override
    public String toString() {
        return name;
    }
}
