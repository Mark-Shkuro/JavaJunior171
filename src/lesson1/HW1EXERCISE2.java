package lesson1;

public class HW1EXERCISE2 {
    public static void main(String[] args) {
        int FirstSide = 6;
        int SecondSide= 15;
        int ThirdSide = 6;
        int FourthSide = 15;
        if (FirstSide == SecondSide & ThirdSide == FourthSide & SecondSide == ThirdSide){
            System.out.println("Квадрат");}
        else if (FirstSide == ThirdSide & SecondSide == FourthSide){
            System.out.println("Прямоугольник");
        }
        else if (FirstSide != SecondSide & ThirdSide != FourthSide & SecondSide != ThirdSide){
            System.out.println("Другая фигура");}
    }
}
