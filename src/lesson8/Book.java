package lesson8;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private String izdanie;
    private int price;
    private int salesProsent;
//формула создания конструктора
// 1 - модификатор доступа(в основном всегда паблик)
// 2 - название констуктор (полностью совпадает с названием класса)
// 3 - входящие параметры
// 4 - тело самого конструктора
 public Book (){

}
    public Book (String name, String author){
        this.name = name;
        this.author = author;

    }

    public void setName ( String name ) {
        this.name = name;
    }

    public void setAuthor ( String author ) {
        this.author = author;
    }

    public void setIzdanie ( String izdanie ) {
        this.izdanie = izdanie;
    }

    public void setPrice ( int price ) {
        this.price = price;
    }

    public void setSalesProsent ( int salesProsent ) {
        this.salesProsent = salesProsent;
    }

    public Book ( String name, String autho, String izdanie, int price, int salesProsent){
     this.author = author;
     this.name = name;
     this.izdanie = izdanie;
     this.price = price;
     this.salesProsent = salesProsent;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return name.equals(book.name) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode () {
        return Objects.hash(name, author);
    }

    @Override
    public String toString () {
        return "Book{" +
                "name= '" + name + '\'' +
                ", author = '" + author + '\'' +
                ", izdanie = '" + izdanie + '\'' +
                ", price=" + price +
                ", salesProsent = " + salesProsent +
                '}';
    }
}
