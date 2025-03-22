import tools.Line;

import java.awt.*;

public class MainTest {
    public static void main(String[] args) {
/*
       // test shapes.Quadrangle
        shapes.Quadrangle quadrangle = new shapes.Quadrangle(new Point(1, 2), new Point(-7, 8));

        System.out.println(quadrangle);
        System.out.println("Area = " + quadrangle.getArea());

        //при увеличении фигуры
        quadrangle = (shapes.Quadrangle) quadrangle.Scale(2);
        System.out.println("Area = " + quadrangle.getArea());

        //при передвижении фигуры
        quadrangle = (shapes.Quadrangle) quadrangle.move(new Point(4, 8));
        System.out.println("Area = " + quadrangle.getArea());
        System.out.println("startPoint = " + quadrangle.getStartPoint());
        System.out.println("finishPoint = " + quadrangle.getFinishPoint());

        //test shapes.Rhombus
        shapes.Rhombus rhombus = new shapes.Rhombus(new Point(8, 8), new Point(12, 2));

        System.out.println(rhombus);
        System.out.println("diagonalY = " + rhombus.getDiagonalY());
        System.out.println("diagonalX = " + rhombus.getDiagonalX());
        System.out.println("Area = " + rhombus.getArea());

        //при увеличении фигуры
        rhombus = (shapes.Rhombus) rhombus.Scale(2);
        System.out.println("diagonalY = " + rhombus.getDiagonalY());
        System.out.println("diagonalX = " + rhombus.getDiagonalX());
        System.out.println("Area = " + rhombus.getArea());

        //при передвижении фигуры
        rhombus = (shapes.Rhombus) rhombus.move(new Point(8, 8));
        System.out.println("diagonalY = " + rhombus.getDiagonalY());
        System.out.println("diagonalX = " + rhombus.getDiagonalX());
        System.out.println("Area = " + rhombus.getArea());


        // test shapes.Triangle
        shapes.Triangle triangle = new shapes.Triangle(new Point(8,8), new Point(10,10));
        System.out.println(triangle);
        System.out.println("Height = " + triangle.getHeight());
        System.out.println("Area = " + triangle.getArea());

        //при увеличении фигуры
        triangle = (shapes.Triangle) triangle.Scale(2);
        System.out.println("Height = " + triangle.getHeight());
        System.out.println("Area = " + triangle.getArea());

        //при передвижении фигуры
        triangle = (shapes.Triangle) triangle.move(new Point(6, 6));
        System.out.println("Height = " + triangle.getHeight());
        System.out.println("Area = " + triangle.getArea());
        System.out.println("startPoint = " + triangle.getStartPoint());
        System.out.println("finishPoint = " + triangle.getFinishPoint());


        //test shapes.Circle

        shapes.Circle circle = new shapes.Circle(new Point(2, 2), new Point(7, 7));
        System.out.println(circle);
        System.out.println("Diameter = " + circle.getDiameter());
        System.out.println("Area = " + circle.getArea());

        //при увеличении фигуры
        circle = (shapes.Circle) circle.Scale(2);
        System.out.println("Diameter = " + circle.getDiameter());
        System.out.println("Area = " + circle.getArea());
        System.out.println("startPoint = " + circle.getStartPoint());
        System.out.println("finishPoint = " + circle.getFinishPoint());

        //при передвижении фигуры
        circle = (shapes.Circle) circle.move(new Point(6, 6));
        System.out.println("Area = " + circle.getArea());
        System.out.println("startPoint = " + circle.getStartPoint());
        System.out.println("finishPoint = " + circle.getFinishPoint());
*/

        //test Line
        Line line = new Line(new Point(2, 3), new Point(7, 9));
        System.out.println(line);
        System.out.println("Length = " + line.length);
        System.out.println("startPoint = " + line.getStartPoint());
        System.out.println("finishPoint = " + line.getFinishPoint());
        line = (Line) line.move(new Point(5, 8));
        System.out.println("Length = " + line.length);
        System.out.println("startPoint = " + line.getStartPoint());
        System.out.println("finishPoint = " + line.getFinishPoint());





    }
}