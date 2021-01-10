package lesson5;

import java.util.Scanner;
import java.lang.Math;

public class Main2{
    public static void main ( String[] args ) {
        System.out.println("Выберите фигуру: ");
        System.out.println("-- Круг");
        System.out.println("-- Прямоугольник");
        System.out.println("-- Треугольник");
        System.out.println("-- Овал");

        Scanner scanner = new Scanner(System.in);
        String inputFigure = scanner.nextLine();

        System.out.println("Площадь или периметр?");
        String inputAction = scanner.nextLine();

        if (inputFigure.equalsIgnoreCase("Круг")) {  //метод который сравнивает равенства
            System.out.println("Введите радиус: ");
            String radius = scanner.nextLine();
            double r = Double.parseDouble(radius); // распознать Дабл(ПРЕВРАЩАЕМ ТЕКСТ В ЧИСЛО)
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь круга: " + Math.PI * (r * r));
            } else {
                System.out.println("Периметр круга: " + Math.PI * (2 * r));
            }
        }
        if (inputFigure.equalsIgnoreCase("Прямоугольник")) {  //метод который сравнивает равенства
            System.out.println("Введите сторону A: ");
            String sideA = scanner.nextLine();
            double A = Double.parseDouble(sideA); // распознать Дабл(ПРЕВРАЩАЕМ ТЕКСТ В ЧИСЛО)
            System.out.println("Введите сторону B: ");
            String sideB = scanner.nextLine();
            double B = Double.parseDouble(sideB);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь прямоугольника: " + A * B);
            } else {
                System.out.println("Периметр прямоугольника: " + 2 * (A + B));
            }
        }
        if (inputFigure.equalsIgnoreCase("Треугольник")) {
            System.out.println("Введите сторону А: ");
            String sideA = scanner.nextLine();
            double A = Double.parseDouble(sideA);
            System.out.println("Введите сторону B: ");
            String sideB = scanner.nextLine();
            double B = Double.parseDouble(sideB);
            System.out.println("Введите сторону С: ");
            String sideC = scanner.nextLine();
            double C = Double.parseDouble(sideC);
            double S = (A + B + C) / 2;
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь треугольника: " + Math.sqrt(S * (S - A) * (S - B) * (S - C)));
            } else {
                System.out.println("Периметр треугольника: " + A + B + C);
            }
        }
        if (inputFigure.equalsIgnoreCase("Овал")) {  //метод который сравнивает равенства
            System.out.println("Введите длинну большой полуоси: ");
            String lengthA = scanner.nextLine();
            double A = Double.parseDouble(lengthA);
            System.out.println("Введите ширину маленькой полуоси: ");
            String lengthB = scanner.nextLine();
            double B = Double.parseDouble(lengthB);
            if (inputAction.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь овала: " + Math.PI * (A * B));
            } else {
                System.out.println("Периметр овала: " + 2 * Math.PI * (A + B) / 8);
            }
        }
    }
}

