package lesson12;

import java.util.HashMap;

public class Main1{
    public static void main ( String[] args ) {
        HashMap<String, Integer> resept = new HashMap(); // массив по ассоциации
        resept.put("Яблоко", 200); // заполняем массив
        resept.put("Груша", 300);
        resept.put("Слива", 500);
        resept.put("Сливки", 700);
        resept.put("Груша", 200 + resept.get("Груша"));//добавляем данные к груше!

        System.out.println(resept);

        int[] numbers = {2, 3, 2, 2, 1, 2, 3, 4, 4, 5, 3, 3, 2};
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (Integer num : numbers) { // проходится по всему массиву намберс
            if (counter.containsKey(num)){ // метод который узнает,а содержится ли такой ключ
                counter.put(num, 1 + counter.get(num)); //добавляем 1,если уже содержиться
            }else{
                counter.put(num,1); // если не содержиться,берем на ключ и его значение 1
            }
        }
        System.out.println(counter);
    }
}
