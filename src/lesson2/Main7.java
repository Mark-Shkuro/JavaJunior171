package lesson2;

public class Main7 {
    public static void main(String[] args) {
        int [] numbers = {2,5,8,18,92,104}; //индексы от 0 до 5 (зависит от к-ва чисел)

        for (int i =numbers.length -1;i>=0; i--){
            System.out.println(numbers[i]);
        }
    }
}
