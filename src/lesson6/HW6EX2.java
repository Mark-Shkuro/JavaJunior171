package lesson6;

import sun.awt.geom.AreaOp;

public class HW6EX2 {
    public static void main ( String[] args ) {
        double result2 = HW6EX1.triangleArea1("30", "30", "30");
        System.out.println("Площадь треугольника: " + result2);

        int[] numbers = new int[]{2, 5, 6, 87, 9, 10};
        System.out.println(numbers);

        HW6EX1.reverse("Я люблю картошку");

        System.out.println(" ");

        int [] nums = {1,4,6,7,9,10,12};
        HW6EX1.evenNumbers(nums);

        System.out.println(" ");
        int result5 = HW6EX1.countGlass("Сегодня хороший день");
        System.out.println("Количество гласных букв: " + result5);

        int result3 = HW6EX1.countSoglasnie("Сегодня хороший день");
        System.out.println("Количество согласных букв: " + result3);

    }
}
