package lesson6;

// ТЕМА СОЗДАНИЕ МЕТОДОВ
// 1 - модификатор доступа (определение области видимости)
// public - открытый доступ, этот метод можно вызвать внутри всего проекта
// protected - внутри текущего класса + наследники
// ____ (packet(ПУСТО) - этот метод можно вызвать внутри текущей папки (package)
// 2 - private - видимость метод внутри текущего класса (TextUtils)
// static есть или нет (Static - общее(нет привязки к объекту)
// если static не указывается, то мы можем обратиться к определенному объекту)
// возвращаемый тип
// 3 - возвращаемый тип (или void если его нет)
// 4 - название метода (всегда с маленькой буквы, макс удобное название)
// 5- входящие параметры (в круглых скобках,через запятую,сколько угодно значений
// с указанием типа и названия переменной)
// 6 - тело выполнения метода, то что будет выполняться когда выовем этот метод
public class TextUtils {
    public static int countVowel(String text) {
        String s = text.toLowerCase(); // toLowerCase - приводим к маленькому регистру
        int vowelCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            switch (s.charAt(i)) {       // берет в себя объект
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    vowelCount++; // считает значения свича , которые были в нашем тексте
                    break; // отрабатывает после каждого цикла for ,если нет значения case
                default:
            }
        }

        return vowelCount;
    }

    public static void printSameCharsFromTexts(String text1, String text2) {
        for (int i = 0; i < text1.length(); i++) {
            char currentCharFromText1 = text1.charAt(i); //берем символ и текст1
            if (text2.contains("" + currentCharFromText1)) { // если он содержится в тексте text2
                System.out.print(currentCharFromText1);                                      // печатаем его
            }
        }
        System.out.println(" ");
    }

    public static String coding(String text) {
        String alphabet = "abcdefgijklmnopqrstuvwxyza123456789/*-+";
        String codingWord = "";
        for (int i = 0; i < text.length(); i++) {
            char currentCharFromText = text.charAt(i);
            int indexCharFromAlphabet = alphabet.indexOf(currentCharFromText); // берем символ из алфавита
            // который равен символу currentCharFromText
            if (indexCharFromAlphabet != -1) {
                codingWord = codingWord + alphabet.charAt(indexCharFromAlphabet + 1);
            } else {
                codingWord = codingWord + currentCharFromText;
            }
        }
        return codingWord;
    }

    public static String decoding(String text) {
        String alphabet = "zabcdefgijklmnopqrstuvwxyz12345678901/*-+";
        String codingWord = "";
        for (int i = 0; i < text.length(); i++) {
            char currentCharFromText = text.charAt(i);
            int indexCharFromAlphabet = alphabet.indexOf(currentCharFromText); // берем символ из алфавита
            // который равен символу currentCharFromText
            if (indexCharFromAlphabet != -1) {
                codingWord = codingWord + alphabet.charAt(indexCharFromAlphabet - 1);
            } else {
                codingWord = codingWord + currentCharFromText;
            }
        }
        return codingWord;
    }
}

