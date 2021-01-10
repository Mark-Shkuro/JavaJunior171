package lesson6;

import java.text.DecimalFormat;

public class HW6EX3 {
    public static void main(String[] args) {
        double a = 100;
        double b = 55;
        double c = 1;
        double d = 11;
        double e = (a/b)+(c/d);
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        String result = decimalFormat.format(e);
        System.out.println(result);
    }
}
