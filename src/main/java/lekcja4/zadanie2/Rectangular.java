package lekcja4.zadanie2;

public class Rectangular extends Shape{
    protected final int sideA;
    protected final int sideB;

    public Rectangular(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double getArea() {
        return sideA * sideB;
    }
    @Override
    public double getPerimeter() {
        return 2 * sideA + 2 * sideB;
    }

}
