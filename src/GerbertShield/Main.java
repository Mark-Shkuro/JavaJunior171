package GerbertShield;

public class Main {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;
        counter = 0; //Счетчик строк инициаnизируется иуnевым значением
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // преобразовать в литры
            System.out.println(gallons + " галлонам соответствует " +
                    liters + " liters.");
            counter++; // Уаеnнчнвать значение счетчика строк на 1 на каждой нтерацнн цнкпа
            if (counter == 10) { //есnн значение счетчика равно 10, аwаестн пустую строку
                System.out.println();
                counter = 0; // &#x441;&#x431;&#x440;&#x43E;&#x441;&#x438;&#x442;&#x44C; &#x441;&#x447;&#x435;&#x442;&#x447;&#x438;&#x43A; &#x441;&#x442;&#x440;&#x43E;&#x43A;
                break;
            }
        }
    }
}