package lesson7;

import java.lang.Math;

public class Oval {

    private double axisA;
    private double axisB;

    public void setAxisA ( double valueAxisA ) {
        axisA = valueAxisA;
    }

    public void setAxisB ( double valueAxisB ) {
        axisB = valueAxisB;
    }

    public double area () {
        double area = Math.PI * axisA * axisB;
        return area;
    }

    public double perimetr () {
        double perimetr = 4 * (Math.PI * axisA * axisB + (axisA - axisB)) / axisA + axisB;
        return perimetr;
    }
}
