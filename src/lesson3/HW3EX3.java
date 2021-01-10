package lesson3;

public class HW3EX3 {
    public static void main(String[] args) {
        char[] adcd = {'a', 'b', 'c', 'd'};
        System.out.print("Значения массива стоят в обратном порядке: ");
        for (int i = adcd.length - 1; i >= 0; i--) {
            System.out.print(adcd[i]);
        }
    }
}