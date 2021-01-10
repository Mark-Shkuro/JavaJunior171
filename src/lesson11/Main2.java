package lesson11;

import java.sql.SQLOutput;
import java.util.HashSet;

public class Main2{
//LinedHashSet = тоже самое,но элементы идут по порядку.
    public static void main ( String[] args ) {
        HashSet<Integer> hashSet = new HashSet<>(); // выбирает только уникальные элементы
        hashSet.add(10);                            // элементы не идут по порядку
        hashSet.add(547);                           // в ней нет индексов
        hashSet.add(322);
        hashSet.add(10);
        hashSet.add(547);


        System.out.println(hashSet);
    }
}
