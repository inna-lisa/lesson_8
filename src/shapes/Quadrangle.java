package shapes;
import java.awt.*;

public class Quadrangle extends Shape {

    double width;
    double height;
    double scale;
    String name = "QUADRANGLE";

    public Quadrangle(Point startPoint, Point finishPoint) {
        super(startPoint, finishPoint);
        this.width = Utils.pointDistance(startPoint.getX(), finishPoint.getX());
        this.height = Utils.pointDistance(startPoint.getY(), finishPoint.getY());
    }

    @Override
    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getBorderWidht() {
        return 0.5;
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
       return new Quadrangle(movePoint, new Point((int) (movePoint.getX() + width), (int) (movePoint.getY() - height)));
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public double getScale() {
        return  scale;
    }

    @Override
    public Object Scale(double scale) {
        this.scale = scale;
        return new Quadrangle(startPoint, new Point((int) (startPoint.getX() + (width * scale)), (int) (startPoint.getY() - (height * scale))));
    }

    @Override
    public String toString() {
        return name + " " + width + " " + height ;
    }
}
