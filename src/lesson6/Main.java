package lesson6;

public class Main {
    public static void main(String[] args) {

        int result = TextUtils.countVowel("dsigseeeeeeaaawqe ");
        System.out.println(result);

        TextUtils.printSameCharsFromTexts("qwerty", "qsefrgt");

        String codingWords = TextUtils.coding("mama45!!");
        System.out.println(codingWords);

        String decodingWords = TextUtils.decoding(codingWords);
        System.out.println(decodingWords);


    }
}


