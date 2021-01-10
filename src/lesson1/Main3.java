package lesson1;

public class Main3 {
    public static void main(String[] args) {
        int mark = 9;
        switch (mark){
            case 5:
                System.out.println("Отлично");
                break; // обрывает выполнение switch-кода
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Не очень");
                break;
            case 2:
                System.out.println("Ужас");
                break;
            default: // значение по-умолчанию , не пишем break после него
                System.out.println("Это не оценка");
        }
    }
}
