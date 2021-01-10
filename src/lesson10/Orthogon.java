package lesson10;

public class Orthogon implements Figure{
    public int sideA;
    public int sideB;

    public Orthogon ( int sideA, int sideB ) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void area () {
        System.out.println("Площадь прямоугольника: " + this.sideA * this.sideB);
    }

    @Override
    public void perimetr () {
        System.out.println("Периметр прямоугольника: " + 2 * (this.sideA + this.sideB));

    }
}
