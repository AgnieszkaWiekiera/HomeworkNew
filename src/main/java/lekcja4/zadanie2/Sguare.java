package lekcja4.zadanie2;

public class Sguare extends Rectangular{

    public Sguare(int sideA, int sideB) {
        super(sideA, sideB);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

}
