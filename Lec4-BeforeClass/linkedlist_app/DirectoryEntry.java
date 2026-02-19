package linkedlist_app;

//same as Lec 3
public class DirectoryEntry {
    private String name;
    private String number;

    public DirectoryEntry(String name,
            String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "name: " + name + ", phone number: " + number;
    }

    //comparison based on name only
    //de1.equals(de2);
    //equals other
    @Override
    public boolean equals(Object other) {
//    public boolean equals(DirectoryEntry other) {

        //other: null
        if (other == null) {
            return false;
        }

        //not same type
        if (this.getClass() != other.getClass()) {
            return false;
        }

        //same identity
        if (this == other) {
            return true;
        }

        return this.name.equals(((DirectoryEntry)other).name);
    }


}
