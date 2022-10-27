package org.example.shape;

public class Trapezoid implements Shape {
    private double a1;
    private double a2;
    private double b;

    public Trapezoid(double a1, double a2, double b) {
        this.a1 = a1;
        this.a2 = a2;
        this.b = b;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getSquare() {
        return new Triangle(Math.abs(a1 - a2), b).getSquare() +
                new Rectangle(Math.min(a1, a2), b).getSquare();
    }
}
