package linkedlist_generic_demo;

public class SingleLinkedListTest {

    public static void main(String[] args) {

        SingleLinkedList<String> names = new SingleLinkedList<>();
        names.add(1, "Ann");
        names.addFirst("Ann");

        SingleLinkedList<Integer> numbers = new SingleLinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
    }

}
