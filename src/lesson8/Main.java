package lesson8;

public class Main {
    public static void main ( String[] args ) {
        Book book1 = new Book("Кто убил Оливию Колинз?", "Джо спейн");
        Book book2 = new Book("Кто убил Оливию Колинз?", "Джо спейн");

        System.out.println(book1.equals(book2)); // в другом файле(book) генерируем Equals, Hashkod
                                                // для сравнение book1 и book2
        book1.hashCode();
        System.out.println(book1.toString());

        book1.getClass();
    }
}


//