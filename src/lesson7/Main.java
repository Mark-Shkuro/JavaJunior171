package lesson7;

import jdk.nashorn.internal.ir.FunctionNode;

public class Main {
    public static void main ( String[] args ) {


        Bludo vinigret = new Bludo();
        Bludo icecream = new Bludo();

        vinigret.setName("Зимний салат винигрет");
        icecream.setName("Мороженное со сливками");


        System.out.println(icecream.getName());




    }
}
