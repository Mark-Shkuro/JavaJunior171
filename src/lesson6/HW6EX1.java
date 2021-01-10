
package lesson6;

import java.lang.Math;


public class HW6EX1 {
    public static double triangleArea1 ( String sideA, String sideB, String sideC ) {

        String sideAA = sideA.toLowerCase();
        double a = Double.parseDouble(sideAA);

        String sidebBB = sideB.toLowerCase();
        double b = Double.parseDouble(sidebBB);

        String sideCC = sideC.toLowerCase();
        double c = Double.parseDouble(sideCC);

        double s = (a + b + c) / 2;

        double s1 = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return s1;
    }

    public static void evenNumbers ( int[] numbers ) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i]);
            }
        }
    }

    public static void reverse ( String text ) {
        String s1 = text.toLowerCase();
        char[] text1 = s1.toCharArray();
        for (int i = text.length() - 1; i >= 0; i--) {

            System.out.print(text1[i]);

        }
    }

    public static int countGlass ( String text2 ) {
        String s1 = text2.toLowerCase();
        int summEven = 0;
        for (int i = 0; i < text2.length(); i++) {
            switch (s1.charAt(i)) {
                case 'а':
                case 'е':
                case 'ё':
                case 'и':
                case 'о':
                case 'у':
                case 'ю':
                case 'я':

                    summEven++;
                    break;
                default:

            }
        }
        return summEven;
    }

    public static int countSoglasnie ( String text3 ) {
        String s2 = text3.toLowerCase();
        int summOdd = 0;
        for (int i = 0; i < text3.length(); i++) {
            switch (s2.charAt(i)) {
                case 'ц':
                case 'к':
                case 'н':
                case 'г':
                case 'ш':
                case 'щ':
                case 'з':
                case 'х':
                case 'ф':
                case 'в':
                case 'п':
                case 'р':
                case 'л':
                case 'д':
                case 'ж':
                case 'ч':
                case 'с':
                case 'м':
                case 'т':
                case 'б':

                    summOdd++;
                    break;
                default:

            }
        }
        return summOdd;
    }
}

