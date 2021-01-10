package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main1{
    public static void main ( String[] args ) {
        ArrayList<String> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis(); // возвращает число милисекунд от даты
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, "qwer" + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Метод add от arrayList " + (endTime - startTime));

        LinkedList<String> linkedListList = new LinkedList<>();
        long startTime1 = System.currentTimeMillis(); // возвращает число милисекунд от даты
        for (int i = 0; i < 100000; i++) {
            linkedListList.add(0, "qwer" + i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Метод add от linkedList " + (endTime1 - startTime1));


        long startTime2 = System.currentTimeMillis(); // возвращает число милисекунд от даты
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Метод get arrayList " + (endTime2 - startTime2));

        long startTime3 = System.currentTimeMillis(); // возвращает число милисекунд от даты
        for (int i = 0; i < 100000; i++) {
            linkedListList.get(i);
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Метод get  linkedList " + (endTime3 - startTime3));

    }
}
