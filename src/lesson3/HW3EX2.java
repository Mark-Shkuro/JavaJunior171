package lesson3;

public class HW3EX2 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};
        String sentence = "Are you ready to start studying of programming?";
        String sentenceToLowerCase = sentence.toLowerCase();
        char[] charsFromSentece = sentence.toLowerCase().toCharArray();
        for (int i = 0; i < charsFromSentece.length; i++) {
            char currentCharFromSentence = charsFromSentece[i];
            for (int j = 0; j < abcd.length; j++) {
                char currentCharFromAbcd = abcd[j];
                if (currentCharFromSentence == currentCharFromAbcd) {
                    charsFromSentece[i] = qwer[j];
                }
            }
        }
        String sentenceWithReplaceChars = String.valueOf(charsFromSentece);
        System.out.print(sentenceWithReplaceChars);
    }
}