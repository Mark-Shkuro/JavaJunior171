package lesson3;

public class HW3EX1 {
    public static void main(String[] args) {
        /*String text = "У меня все хорошо, замечательно, у меня все - получается!";
        char[] text1 = text.toCharArray();
        for (int i = 0; i < text1.length; i++) {
            if (text1[i] == ',') {
                text1[i] = ' ';
            } else {
                if (text1[i] == '-') {
                    text1[i] = ' ';
                } else {
                    if (text1[i] == '!') {
                        text1[i] = ' ';
                    }
                    System.out.print(text1[i]);
                }
            }
        } */
        String text = "У меня все хорошо, замечательно, у меня все - получается!";
        char[] charsFromText = text.toCharArray();
        for (int i = 0; i < charsFromText.length; i++) {
            if (charsFromText[i] == ',' || charsFromText[i] == '-' || charsFromText[i] == '!'){
                charsFromText[i] = ' ';
            }
            System.out.print(charsFromText[i]);
        }
    }
}

