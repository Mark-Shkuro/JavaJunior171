package lesson13;

public class Main{
    public static void main ( String[] args ) {
        Matrix matrix = new Matrix(10,10);

        double[][] data = {{234, 5, 34, 6},
                           {23, 65, 7, 4},
                           {1, 5, 4, 2}};

        double[][] data1 = {{1, 1, 1, 1},
                            {1, 1, 1, 1},
                            {1, 1, 1, 1},
                            {1, 1, 1, 1}};

        Matrix matrix2 = new Matrix(data);
        Matrix matrix3 = new Matrix(data1);

        System.out.println(matrix2.getValueAt(2,4));
        System.out.println(matrix2.getValueAt(2,1));
        System.out.println(matrix2.isIdentityMatrix());
        System.out.println(matrix3.isIdentityMatrix());
        IMatrix addResult = matrix2.add(matrix3);
        addResult.printToConsole();
    }
}
