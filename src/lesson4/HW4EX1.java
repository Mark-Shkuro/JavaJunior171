package lesson4;

public class HW4EX1 {
    public static void main(String[] args) {
        int[][] numbers = {{2, 4, 7, 4},
                {2, 6, 4, 6},
                {1, 4, 6, 8},
                {1, 4, 6, 8}};

        int summ = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    summ += numbers[i][j];
                }
            }
        }
        System.out.print(summ);
    }

}
