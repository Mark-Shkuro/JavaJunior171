package lesson6;

public class StringUtils {
    public static void main(String[] args) {
        String text1 = "Я люблю картошку";
        char[] text2 = text1.toCharArray();
        for (int i = text1.length() - 1; i >= 0; i--) {
            System.out.print(text2[i]);
        }
    }
}
