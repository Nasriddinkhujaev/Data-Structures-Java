package arraylist_demo;

import java.util.ArrayList;
import java.util.List;

//to be modified in Lec 3

public class DirectoryDemo {

    public static void main(String[] args) {
        DirectoryEntry biden = new DirectoryEntry("Biden", "111-111-1111");
        DirectoryEntry biden2 = new DirectoryEntry("Biden", "111-111-1111");
        DirectoryEntry harris = new DirectoryEntry("harris", "222-222-2222");

        System.out.println(biden.equals(harris));
        System.out.println(biden.equals(biden2));
        biden = biden2;
        System.out.println(biden.equals(biden2));

        //create a list of DirectoryEntry objects 
        List<DirectoryEntry> myPhoneBook = new ArrayList<>();
        myPhoneBook.add(biden);
        myPhoneBook.add(biden2);
        myPhoneBook.add(harris);
        System.out.println(myPhoneBook);
        // use the list

        for (DirectoryEntry de : myPhoneBook) {
            System.out.println(de);
        }
        System.out.println(myPhoneBook.get(2));
        

    }
}
