package lesson12;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2{
    public static void main ( String[] args ) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(6);
        nums.add(4);
        nums.add(7);

        // 1 способ :for
        for (int i=0; i < nums.size();i++){
            System.out.println(nums.get(i));
        }

        //2 способ :for each
        for (Integer num:nums){
            System.out.println(num);
        }
        //3 способ итератор
        for (Iterator<Integer> iter = nums.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }

    }
}
