package lesson1;

public class HW1 {
    public static void main(String[] args) {
        int widthTable = 5;
        int lengthTable = 6;
        int widthRoom = 15;
        int lengthRoom = 20;
        int TablesInRoom = (widthRoom*lengthRoom)/(widthTable*lengthTable);
        System.out.println("Количество столов в комнате " +   TablesInRoom);
    }
}
