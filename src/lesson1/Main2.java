package lesson1;

public class Main2 {
    public static void main(String[] args) {
        int mark = 4;

        if (mark == 5) {
        } else if (mark == 4) {
            System.out.println("Хорошо");
        } else if (mark == 3) {
            System.out.println("Не очень");
        } else if (mark == 2) {
            System.out.println("Ужас");
        } else { System.out.println("Это не оценка");   //будет отработано,если ничего из выше перечисленого не подойдет

        }

    }
}
