import shapes.*;
import shapes.Shape;
import tools.Line;
import tools.Tools;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

       // test shapes.Quadrangle
        Shape quadrangle = new Quadrangle(new Point(1, 2), new Point(-7, 8));
/*
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
*/
        //test shapes.Rhombus
        Shape rhombus = new Rhombus(new Point(8, 8), new Point(12, 2));
/*
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
*/

        // test shapes.Triangle
        Shape triangle = new Triangle(new Point(8,8), new Point(10,10));
        /*
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
*/

        //test shapes.Circle

        Shape circle = new Circle(new Point(2, 2), new Point(7, 7));
        /*
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
        Tools line = new Line(new Point(2, 2), new Point(7, 7));

        Output shape1 = new Output(circle);
        Output shape2 = new Output(rhombus);
        Output shape3 = new Output(quadrangle);
        Output shape4 = new Output(triangle);
        Output shape5 = new Output(line);
    }
}