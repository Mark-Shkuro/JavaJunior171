package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main4{
    public static void main ( String[] args ) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        HashSet<Integer> b = new HashSet<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);

        CollectionUtils utils = new CollectionUtilsImpl();
        Collection<Integer> unionResult = utils.union(a,b);
        System.out.println(unionResult);
    }
}
