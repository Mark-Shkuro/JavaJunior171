package lesson10;

import java.lang.Math;

public class Triangle implements Figure{
    public int sideA;
    public int sideB;
    public int sideC;
    public double S;

    public Triangle ( int sideA, int sideB, int sideC ) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    @Override
    public void area () {
        double S = (this.sideA + this.sideB + this.sideC) / 2;
        System.out.println("Площадь треугольника: " + Math.sqrt(S * (S - this.sideA) * (S - this.sideB) * (S - this.sideC)));
    }

    @Override
    public void perimetr () {
        System.out.println("Периметр треугольника: " + this.sideA + this.sideB + this.sideC);
    }
}
