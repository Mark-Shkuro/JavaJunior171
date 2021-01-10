package lesson2;

public class HW2EX3 {
    public static void main(String[] args) {
        int masiv[] = {2, 5, 6, 4, 8, 7};
        int sum = 0;
        for (int i = 0; i < masiv.length; i++) {
            sum = sum + masiv[i];
        }
        System.out.println(sum);
    }
}