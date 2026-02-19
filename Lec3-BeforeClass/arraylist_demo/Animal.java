package arraylist_demo;

// to be modified in Lec 3 practice

public class Animal {

    //self-practice in Lec 3
    //add a method named equals to override the method equals(Object other) in class Object
    //equals return true if this animal and other animal have the same name.
    


    private String name = "default";

    public Animal(){
    }

    //method overloading: same method name, different method signature
    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
		return name;
	}

    public void move() {
        System.out.println("Animal" + name + " can move");
    }

    @Override
    public String toString(){
        return "name: " + name;
    }

}
