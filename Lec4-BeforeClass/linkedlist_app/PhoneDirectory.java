package linkedlist_app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PhoneDirectory {
    private List<DirectoryEntry> theDirectory = new LinkedList<>(); //ArrayList<>();

    //enforce: unique name
    public boolean addEntry(String name, String newNumber) {
        for (DirectoryEntry de : theDirectory) {
            if (de.getName().equals(name)) {
                return false;
            }
        }
        theDirectory.add(new DirectoryEntry(name, newNumber));

        return true;
    }

    //public boolean indexOf()


    //book exercise
    public String addOrChangeEntry(String name, String newNumber) {
        //you add the code
        return "";
    }

    //book exercise
    public DirectoryEntry removeEntry(String aName) {
        //you add the code
        return null;
    }
}
