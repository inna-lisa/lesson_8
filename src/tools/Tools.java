package tools;
import interfaces.Drawable;
import java.awt.*;

public abstract class Tools implements Drawable {
    String name;
    Point startPoint;
    Point finishPoint;
    Color color;

    protected Tools(Point startPoint, Point finishPoint) {
        this.startPoint = startPoint;
        this.finishPoint = finishPoint;
    }

    public Point getFinishPoint() {
        return finishPoint;
    }
}
