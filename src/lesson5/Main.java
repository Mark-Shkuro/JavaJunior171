package lesson5;

import java.lang.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String inputPassword = scanner.next(); // сканнер будет ожидать пока мы что-то введем ЗДЕСЬ

        if (inputPassword.length() < 8) {
            System.out.println("Ненадёжный пароль");
            return;
        }

        char[] chars = inputPassword.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0' || chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4' || chars[i] == '5' || chars[i] == '6' || chars[i] == '7' || chars[i] == '8' || chars[i] == '9') {
                System.out.println("Надёжный пароль");
                return;
            }
        }

        System.out.println("Не очень надёжный пароль");

    }
}
