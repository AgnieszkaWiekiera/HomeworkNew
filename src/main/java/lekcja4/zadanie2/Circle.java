package lekcja4.zadanie2;

public class Circle extends Shape{

    private static final double PI = 3.14;
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}