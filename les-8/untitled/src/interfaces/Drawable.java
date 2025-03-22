package interfaces;

import java.awt.*;

public interface Drawable {

    Point getStartPoint();
    Object move(Point movePoint);
    Color getColor();

}
