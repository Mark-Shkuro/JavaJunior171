package lesson10;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Monkey extends AbctractAnimal implements ZooAimal{

    public Monkey (String name) {
        this.name = name;
    }

    @Override
    public void voice () {
        System.out.println("YUP");
    }

    @Override
    public void jump () {
        System.out.println("Обезьяна прыгает");

    }

    @Override
    public void printHello () {
        System.out.println("Привет,я обезьяна");

    }
}
