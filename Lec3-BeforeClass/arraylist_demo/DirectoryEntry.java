package arraylist_demo;

//to be modified in Lec 3
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
    
    // object: toString(), equals(), hash
    //equals other
    // del.equals(de2)  
    @Override
    //public boolean equals(DirectoryEntry other) {
    public boolean equals(Object other) {
        // other == null 
        if (other == null) {
            return false;

        }
        // same identity
        if (this == other) {
            return true;
        }
        // different identity
        if (this != other) {
            return false;
        }

        return this.name.equals(((DirectoryEntry)other).name);
    }
    
    
}
