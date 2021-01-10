package lesson10;
import java.lang.Math;

public class Oval implements Figure{
    public int lengthLargeAxis;
    public int lengthSmallAxis;

    public Oval ( int lengthLargeAxis, int lengthSmallAxis ) {
        this.lengthLargeAxis = lengthLargeAxis;
        this.lengthSmallAxis = lengthSmallAxis;
    }

    @Override
    public void area () {
        System.out.println("Площадь овала: " + Math.PI * (lengthLargeAxis * lengthSmallAxis));
    }

    @Override
    public void perimetr (){
        System.out.println("Периметр овала: " + 2 * Math.PI * (lengthLargeAxis + lengthSmallAxis) / 8);
    }
}
