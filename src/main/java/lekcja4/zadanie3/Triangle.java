package lekcja4.zadanie3;

public class Triangle implements Shape{

    private final int height;
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int height, int sideA, int sideB, int sideC) {
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int getArea() {
        return (sideA * height) / 2;
    }

    @Override
    public int getPerimeter() {
        return sideA + sideB + sideC;
    }
}