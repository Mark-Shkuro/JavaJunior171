package lesson10;

public class Slon extends AbctractAnimal implements ZooAimal {


    public Slon ( String name ) {
        this.name = name;
    }

    @Override
    public void voice () {
        System.out.println("TTTTTTHHHHHHHHH");

    }

    @Override
    public void jump () {
        System.out.println("Слон прыгает");

    }


    @Override
    public void printHello () {
        System.out.println("Привет я слон");

    }


    @Override         // переопределение
    public String toString () {
        return "Slon{" +
                "name='" + name + '\'' +
                '}';
    }


}
