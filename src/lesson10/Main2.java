package lesson10;

public class Main2{
    public static void main ( String[] args ) {


        Orthogon orthogon = new Orthogon(11, 15);
        Triangle triangle = new Triangle(11, 5, 5);
        Oval oval = new Oval(11, 5);


        Figure[] figures = new Figure[3];
        figures[0] = orthogon;
        figures[1] = triangle;
        figures[2] = oval;

        for (Figure figure : figures) {
            figure.perimetr(); // проявления полиморфизма
        }

    }
}

