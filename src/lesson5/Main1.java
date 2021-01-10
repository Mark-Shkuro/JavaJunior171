package lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите email: ");
        String email = scanner.next();

        // ahsdkj@12.
        String[] splitEmailByDog = email.split("@"); // разбиваем на кусочки с помозью @
        if (splitEmailByDog.length != 2) {
            System.out.println("Неверный формат!!!");
            return ;
        }
        if (splitEmailByDog[1].indexOf('.')==-1) { //во второй части емейла смотрим есть ли точка
            System.out.println("Неверный формат!!! Не найдена точка после @");
            return ;
        }
        if (splitEmailByDog[1].endsWith(".")){  // если в конце имейла точка - пароль неверный
            System.out.println("Неверный формат!!! Точка в конце.");
            return ;
        }
        if (email.indexOf("..")!=-1) { //во второй части емейла смотрим есть ли точка
            System.out.println("Неверный формат!!! Найдено двоеточие");
            return ;
        }
        System.out.println("Email нам полностью подходит");
    }
}

