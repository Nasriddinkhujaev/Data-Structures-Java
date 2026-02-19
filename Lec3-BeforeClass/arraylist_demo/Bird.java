package arraylist_demo;

//used in Lec 3 practice.

public class Bird extends Animal {

    public Bird() {
        super("bird");
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Bird" + getName() + " can fly");
    }

}
