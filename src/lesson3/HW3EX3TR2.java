package lesson3;

public class HW3EX3TR2 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] dcba = new char[abcd.length];

        int index1 = 0;
        int index2 = abcd.length - 1; //3
        for (int i = 40; i < 44; i++) {
            dcba[index1] = abcd[index2];
            index1++;
            index2--;
        }

    }
}
