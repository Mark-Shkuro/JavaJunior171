package lesson10;

public class Main1 {
    public static void main ( String[] args ) {
        DrobnoeChislo chislo1 = new DrobnoeChislo();
        chislo1.setDividend(1);
        chislo1.setDivisor(4);

        DrobnoeChislo chislo2 = new DrobnoeChislo();
        chislo2.setDividend(2);
        chislo2.setDivisor(4);


        System.out.println(chislo1);
        System.out.println(chislo2);
    }
}
