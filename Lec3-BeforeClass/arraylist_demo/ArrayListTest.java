package arraylist_demo;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        int[] numbers = {4, 2, 3};
        for (int value : numbers) {
            System.out.println(value);
        }

        //numbers[3] = 10;
        numbers = new int[10];

        //create a list of integers
        List<Integer> newList = new ArrayList<>();

        //call basic list methods
        // add element in list
        newList.add(5);
        newList.add(10);
        newList.add(15);
        for(int value : newList){
            System.out.println(value);
        }
        System.out.println(newList);
        //capacity control in ArrayList

    }
}