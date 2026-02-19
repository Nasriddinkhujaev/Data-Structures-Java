
package arraylist_demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// to be modified in Lec 3 practice
public class AnimalTest {

    public static void main(String[] args) {

        //Using List<E>, ArrayList<E>, LinkedList<E> in Java API  practice.

        //create an empty list of Animal objects: myPets
        List<Animal> myPets = new ArrayList<>();//LinkedList<>();
        //add a number of animals: 1 dog named happy, 1 bird named angry
        Dog happy = new Dog("Dawg");
        Bird angry = new Bird("Angyry");
        myPets.add(happy);
        myPets.add(angry);

        //display list contents
        // method 1: directly call toString() in List<E>
        System.out.println(myPets);
        //display list contents
        // method 2:
        //  * use for each loop to iterate over each item in the list
        for (Animal pet : myPets) {
            System.out.println(pet);
        }
        //find where is the dog
        System.out.println(myPets.indexOf(happy));
        //get the second pet
        System.out.println(myPets.get(1));
        //replace the second pet by a new bird named "joy"
        Bird joy = new Bird("joy");
        myPets.set(1, joy);
        //remove the first pet
        myPets.remove(0);
        //remove the pet named "joy"
        myPets.remove(joy);
    }

}
