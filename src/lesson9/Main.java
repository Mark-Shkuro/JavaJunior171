package lesson9;

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        System.out.println("Введите кол-во строк:");
        Scanner scanner = new Scanner(System.in);
        int colRows = scanner.nextInt();

        System.out.println("Введите кол-во колонок:");
        int colColls = scanner.nextInt();

        System.out.println("Введите кол-во мин на вашем поле:");
        int colMins = scanner.nextInt();


        IgrovoePole pole = new IgrovoePole(colRows, colColls);
        pole.addMinsToPole(colMins);
        pole.countAndFillMinsNum();

        System.out.println("------------Игровое поле: ------------");
        //  pole.printPole();
        pole.printFinalPole();


    }
}
