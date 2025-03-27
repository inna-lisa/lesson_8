package shapes;
import java.awt.*;

public class Circle extends Shape {

    double diameter = Utils.pointDistance(startPoint.getY(), finishPoint.getY());
    double radiusY = diameter / 2;
    double radiusX = Utils.pointDistance(startPoint.getX(), finishPoint.getX()) / 2;
    String name = "CIRCLE";
    double scale;

    public Circle(Point startPoint, Point finishPoint) {
        super(startPoint, finishPoint);
    }
    public Circle(){
        super(new Point(0, 0), new Point(0, 0));
    }

    @Override
    public String getName() {
        return name;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getRadiusY() {
        return radiusY;
    }

    public double getRadiusX() {
        return radiusX;
    }

    @Override
    public double getArea() {
        return radiusY * radiusX * 3.14;
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
        return super.getStartPoint();
    }

    @Override
    public Point getFinishPoint() {
        return super.getFinishPoint();
    }

    @Override
    public Object move(Point movePoint) {
        return new Circle(movePoint, new Point((int)(movePoint.getX() + (radiusX * 2)), (int)(movePoint.getY() + (radiusY * 2))));
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
        return new Circle(startPoint, new Point((int) (startPoint.getX() + (radiusX * 2 * scale)), (int)(startPoint.getY() + (radiusY * 2 * scale))));
    }

    @Override
    public String toString() {
        return name + " " + diameter;
    }
}

