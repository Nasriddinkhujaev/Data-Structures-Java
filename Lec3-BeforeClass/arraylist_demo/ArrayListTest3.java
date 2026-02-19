package arraylist_demo;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

//to be modified in Lec 3

public class ArrayListTest3 {

    public static void main(String[] args) {
        Computer[] lab = new Computer[3];
        lab[0] = new Computer("dell", 3, 16);
        lab[1] = new Notebook("Toshiba", 4, 24, 17, 3.5);
        lab[2] = new Computer("dell", 3.2, 8);

        for (Computer c : lab) {
            System.out.println(c);
        }
        
        //use list, array list, linked list
        List<Computer> lab2List = new ArrayList<>();
        for (Computer c : lab) {
            lab2List.add(c);
        }
        System.out.println(lab2List);
    }
}
