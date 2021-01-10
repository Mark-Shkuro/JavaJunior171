package lesson4;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = {{2, 4, 7, 4},
                           {2, 6},
                           {1, 4, 6, 8},
                           {1, 4, 6, 8}};
        for (int i=0; i< numbers.length; i++){
            for (int j=0; j<numbers[i].length; j++){//сослались на массив намберс
                System.out.print(numbers[i][j] + " "); //добавляем пробелы
            }
            System.out.println();
        }
    }
}
