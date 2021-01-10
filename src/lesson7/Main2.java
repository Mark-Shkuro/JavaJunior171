package lesson7;

public class Main2 {
    public static void main ( String[] args ) {

        Square sq = new Square();
        sq.setSideA(10);
        sq.setSideB(10);
        sq.setSideC(10);
        sq.setSideD(10);

        double result = sq.perimetr();
        double result1 = sq.area();

        System.out.println(result1);
        sq.printSquareOrNo();

        Oval ov = new Oval();
        ov.setAxisA(10);
        ov.setAxisB(10 / 5);

        double result2 = ov.area();
        double result3 = ov.perimetr();
        System.out.println(result3);
        System.out.println(result2);


    }
}
