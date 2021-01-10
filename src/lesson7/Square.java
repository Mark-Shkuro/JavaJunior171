package lesson7;

import java.lang.Math;

public class Square {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public void setSideA ( double valueSideA ) {
        sideA = valueSideA;
    }

    public void setSideB ( double valueSideB ) {
        sideB = valueSideB;
    }

    public void setSideC ( double valueSideC ) {
        sideC = valueSideC;
    }

    public void setSideD ( double valueSideD ) {
        sideD = valueSideD;
    }

    public double perimetr () {
        double perimetr = sideA + sideB + sideC + sideD;
        return perimetr;
    }

    public double area () {
        double area = sideA * sideA;
        return area;
    }

    public void printSquareOrNo () {
        if (sideA == sideB && sideB == sideC && sideC == sideD) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это не квадрат");
        }
    }
}


