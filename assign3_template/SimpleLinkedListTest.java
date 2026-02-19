//File: SimpleLinkedListTest.java. 
//Add a file header comment or a class header comment to your work.

package assign3_template;

/**
 * Assign 3 Template.
 * Testing different methods (successful and failed calls)
 * 
 */
public class SimpleLinkedListTest {

    public static void main(String[] args) {

        // 2.2 Revise SimpleLinkedListTest

        // create an empty singly linked list of int values
        // append some integers

        // For method size, use one test case.
        // test all other methods using at least 2 calls:
        // successful call, e.g. call indexOf(..) and pass an existing integer
        // failed call, e.g. call indexOf(..) and pass a non-existing integer

        // You can reuse some of the code below given to you in the lectures.

        // create an empty list
        SimpleLinkedList numbers = new SimpleLinkedList();

        // append 3 integers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // dump the contents in the list in the original order
        // or use:
        // System.out.println(numbers.toString());
        // print the list and size
        System.out.println("List: " + numbers);
        System.out.println("Size: " + numbers.size());

        // ----- Testing get(index) -----
        System.out.println("Get index 1 (should be 20): " + numbers.get(1));
        System.out.println("Get index 5 (invalid, should be MIN_VALUE): " + numbers.get(5));

        // ----- Testing indexOf(item) -----
        System.out.println("Index of 20 (should be 1): " + numbers.indexOf(20));
        System.out.println("Index of 99 (not in list, should be -1): " + numbers.indexOf(99));

        // ----- Testing contains(item) -----
        System.out.println("Contains 10? (true): " + numbers.contains(10));
        System.out.println("Contains 99? (false): " + numbers.contains(99));

        // ----- Testing removeByValue(item) -----
        System.out.println("Remove 20 (should be true): " + numbers.removeByValue(20));
        System.out.println("Remove 99 (should be false): " + numbers.removeByValue(99));
        System.out.println("List after removals: " + numbers);

        // ----- Testing add(index, item) -----
        numbers.add(1, 25); // insert 25 at index 1
        numbers.add(numbers.size(), 40); // append 40 at the end
        System.out.println("List after insertions: " + numbers);

        // ----- Testing removeByIndex(index) -----
        System.out.println("Remove item at index 0 (should be 10): " + numbers.removeByIndex(0));
        System.out.println("Remove item at invalid index 10 (should be MIN_VALUE): " + numbers.removeByIndex(10));
        System.out.println("List after removeByIndex: " + numbers);

        // Final size
        System.out.println("Final size: " + numbers.size());
    }

}
