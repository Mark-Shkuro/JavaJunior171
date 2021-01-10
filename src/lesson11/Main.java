package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;
/*texts.set(0,"2222"); //заменяем элемент по индексу 0
System.out.println(texts.contains("2222")); // проверяем содержиться ли 2222 в коллекции texts
System.out.println(texts.size()); //узнать сколько элементов в коллекции
//texts.remove(1); удаляем элемент
// texts.isEmpty(); узнаем пустой или нет
// texts.clear(); удаляем всё
//texts.sort(); сортируем
System.out.println(texts.get(1)); // показывается элементов по позиции */

public class Main{ //Коллекции
    public static void main ( String[] args ) {
        ArrayList<String> texts = new ArrayList<>(); //нельзя хранить примитивные типы
        texts.add("qqqq");
        texts.add("wwww");
        texts.add("rrrr");
        texts.add("eeee");

        texts.add(1, "%%%"); //добавляем элемент по индексу 0
        System.out.println(texts.get(1));
        System.out.println(texts);

        LinkedList<String> test = new LinkedList<>(); // связанная(объекты) коллекция
        test.add("111");
        test.add("222");
        test.add("333");
        test.add("444");

        System.out.println(test);
    }
}
