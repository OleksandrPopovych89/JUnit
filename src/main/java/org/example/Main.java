package org.example;

import org.example.shape.Trapezoid;

public class Main {
    public static void main(String[] args) {


        Trapezoid trapezoid = new Trapezoid(4.15, 2.2, 2.8);


        System.out.println(trapezoid.getSquare()/2.2);
    }
}