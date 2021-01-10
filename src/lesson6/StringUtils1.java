package lesson6;

public class StringUtils1 {
    public static void main(String[] args) {
        String text1 = "Я люблю картошку";
        char[] text2 = text1.toCharArray();
        for (int i = 0; i <= text1.length(); i++) {
            System.out.print(text2[i]);
        }
    }
}
