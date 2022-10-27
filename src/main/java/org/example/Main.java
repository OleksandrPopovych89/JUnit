package org.example;

import org.example.shape.Rectangle;
import org.example.shape.Trapezoid;
import org.example.shape.Triangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(25, 10);
        Triangle triangle = new Triangle(10, 20);

        Trapezoid trapezoid1 = new Trapezoid(10, 30, 10);
        Trapezoid trapezoid2 = new Trapezoid(30, 10, 10);

        System.out.println(rectangle.getSquare());
        System.out.println(triangle.getSquare());
        System.out.println(trapezoid1.getSquare());
        System.out.println(trapezoid2.getSquare());
    }
}