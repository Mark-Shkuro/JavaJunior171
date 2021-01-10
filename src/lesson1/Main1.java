package lesson1;

public class Main1 {
    public static void main(String[] args) {

        int money = 30000;
        int tripCost = 75000;
        int monthsToTrip = 3;
        int salary = 20000;
        int monthlyExpenses = 10000;
        int savedMoney = money + (salary * monthsToTrip) - (monthsToTrip * monthlyExpenses);

        if (savedMoney>=tripCost || tripCost < 60000){
            System.out.println("Поедем!");


        }
        else    {
            System.out.println("НЕ поедем! У нас только" + savedMoney);

        }
    }
}
