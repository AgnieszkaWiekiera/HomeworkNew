package lekcja4.zadanie3;

public class Rectangle implements Shape{
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int getArea() {
        return sideA * sideB;
    }

    @Override
    public int getPerimeter() {
        return (sideA + sideB) * 2;
    }
}