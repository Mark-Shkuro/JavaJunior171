package lesson7;

import java.lang.Math;

public class Triangle {
    private double sideAB;
    private double sideBC;
    private double sideCA;

    public void setSideAB ( double valueSideAB ) {
        sideAB = valueSideAB;
    }

    public void setSideBC ( double valueSideBC ) {
        sideBC = valueSideBC;
    }

    public void setSideCA ( double valueSideCA ) {
        sideCA = valueSideCA;
    }

    public double perimetr () {
        double perimetr = sideAB + sideBC + sideCA;
        return perimetr;

    }

    public double area () {
        double halfPerimetr = this.perimetr() / 2;

        double area = Math.sqrt(this.perimetr() / 2 * (halfPerimetr - sideAB) *
                (halfPerimetr - sideBC) * (halfPerimetr - sideCA));
        return area;
    }

    public void printTypeOfTriangle () {
        if (sideAB == sideBC && sideCA == sideAB) {
            System.out.println("Равносторонний треугольник");
        } else if (sideAB != sideBC && sideBC != sideCA && sideAB != sideCA) {
            System.out.println("Разносторонний треугольник");
        } else {
            System.out.println("Равнобедренный треугольник");
        }
    }
}
