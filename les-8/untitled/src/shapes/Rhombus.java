package shapes;

import java.awt.*;

public class Rhombus extends Shape {

    double diagonalY = Utils.pointDistance(startPoint.getY(), finishPoint.getY());
    double diagonalX = Utils.pointDistance(startPoint.getX(),finishPoint.getX()) * 2;
    double side = Utils.hypotenuse(diagonalY / 2, diagonalX / 2);
    public static final String name = "RHOMBUS";
    double scale;

    public Rhombus(Point startPoint, Point finishPoint) {
        super(startPoint, finishPoint);
    }

    public double getSide() { return side;   }
    public double getDiagonalY() { return diagonalY;   }
    public double getDiagonalX() { return diagonalX;   }

    @Override
    public double getArea() {
        return (diagonalY * diagonalX) / 2;
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
        return new Rhombus(movePoint, new Point((int)(startPoint.getX() + diagonalX / 2), (int)(getStartPoint().getY() + diagonalY)));
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
        return new Rhombus(getStartPoint(), new Point((int)(startPoint.getX() + diagonalX * scale / 2), (int)(getStartPoint().getY() + (diagonalY * scale))));
    }

    @Override
    public String toString() {
        return name + " " + side;
    }
}
