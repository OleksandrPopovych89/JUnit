package org.example.shape;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = Math.abs(a);
        this.b = Math.abs(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getSquare() {
        return a * b;
    }
}
