package dto;

public class ShapeDTO {

    private double width;
    private double length;

    private double radius;

    private double a;
    private double b;
    private double c;

    public ShapeDTO(double width, double length, double radius,
                    double a, double b, double c) {
        this.width = width;
        this.length = length;
        this.radius = radius;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getRadius() {
        return radius;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}