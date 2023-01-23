package lekcja4.zadanie2;

public class Triangle extends Shape {
    private final int triangleHeight;
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int triangleHeight, int sideA, int sideB, int sideC) {
        this.triangleHeight = triangleHeight;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return (sideA * triangleHeight) / 2;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}