//File: SimpleLinkedList.java. 
//Add a file header comment or a class header comment to your work.

package assign3_template;

/**
 * Assign 3 template. Implement more methods in List interface.
 */
public class SimpleLinkedList {

    // -------Start of Assign 3 --------/

    // 2.1.2 Coding Requirements
    // You can call other methods to complete a method.
    // You can also add private methods, and then call these methods
    // to complete a method required in this assignment.
    // You are NOT allowed to add or remove data fields to/from SimpleLinkedList
    // class.
    // You are NOT allowed to change the definition of Node class.

    // 2.1.1 What Code to Add
    // -----Required ---------------//

    // Remove the first occurrence of the specified item from this linked list.
    // If success, return true. Otherwise, return false.
    public boolean removeByValue(int item) {
        // add your own code

        if (head == null) { // if the list is empty
            return false;
        }
        if (head.data == item) { // if head is the item
            head = head.next;
            size--; // update the size
            return true;
        }
        Node previousNode = head;
        Node currentNode = head.next;

        while (currentNode != null) { // loop through until current is the last item
            if (currentNode.data == item) { // check if the current is the item
                previousNode.next = currentNode.next; // remove the item by linking previous and next
                size--; // update size after removing
                return true;
            }
            previousNode = currentNode; // update previous
            currentNode = currentNode.next; // update current
        }

        // Hint:
        // call your indexOf(...) to locate the item,
        // convert the following in SingleLinkedList<E>
        // private E removeFirst()
        // private Node<E> getNode(int index)
        // private E removeAfter(Node<E> node)

        // Hint: if you implement this from scratch, remember to save:
        // predecessor node reference
        // current node reference

        return false; // if not found
    }
    // done

    // add item to be at [index];
    // if index is [0, size-1], insert item between [index-1] and [index]
    // if index is size, append item to the end of this linked list.
    public void add(int index, int item) {
        // add your own code
        if (index > size || index < 0) { // IndexOutOfBoundsException
            System.out.println("wrong index");
            return;

        }

        Node temp = new Node(item);

        if (index == 0) { // insert at the head
            temp.next = head;
            head = temp;
            return;
        } else {
            Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;// move to node at index-1
            }
            temp.next = current.next;
            current.next = temp;
        }
        size++; // size update

        // Hint:
        // convert the following in SingleLinkedList<E>
        // public void add(int index, E item)
        // public void addFirst(E item)
        // private Node<E> getNode(int index)
        // private void addAfter(Node<E> node, E item)

    }
    // done

    // Get the integer item at the specified position and return the integer value.
    // If the index is not valid, throw an exception or print an error message
    // and return Integer.MIN_VALUE.
    public int get(int index) {
        // add your own code

        if (index < 0 || index >= size) {
            System.out.println("IndexOutOfBoundsException");
            return -1;
        }
        int result = head.data;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        result = current.data;
        // Hint:
        // convert the following in SingleLinkedList<E>
        // public E get(int index)
        // private Node<E> getNode(int index)

        return result;

    }
    // done

    // Search this linked list for the first occurrence of the specified integer:
    // item.
    // If the item is found, return its index. Otherwise return -1.
    public int indexOf(int item) {
        // add your own code
        Node current = head;

        for (int i = 0; i < size; i++) {
            if (current.data != item) {
                current = current.next;
            } else {
                return i;
            }
        }
        // Hint:
        // use a looping like the one in toString()
        // in addition, add a counter,
        // increment the counter for each element checked
        // can use size for loop control.

        return -1;
    }
    // done

    // Find out if the specified integer: item is in this linked list.
    // Returns true if yes, false otherwise.
    public boolean contains(int item) {
        // add your own code
        Node current = head;

        for (int i = 0; i < size; i++) {
            if (current.data != item) {
                current = current.next;
            } else {
                return true;
            }
        }
        // Hint:
        // can either call indexOf(...)
        // or directly search for the item using a loop like the one in toString()

        return false;
    }
    // done

    // return how many integers are in this linked list
    public int size() {
        return size;
    }
    // done

    // -----Bonus ---------------//
    // Remove the item at the specified position from this linked list and
    // return the removed item.
    // If the index is not valid, throw an exception or print an error message
    // and return Integer.MIN_VALUE.
    public int removeByIndex(int index) {
        // Add your own code
        if (index < 0 || index >= size) {
            return Integer.MIN_VALUE;
        }

        int removedValue;

        if (index == 0) {
            removedValue = head.data;
            head = head.next;
        } else {
            Node current = head.next;
            Node prev = head;

            for (int i = 1; i < index; i++) {
                prev = current;
                current = current.next;

            }
            removedValue = current.data;
            prev.next = current.next; // unlink the node

        }

        // Hint:
        // verify that index is valid
        // convert the following in SingleLinkedList<E>
        // private Node<E> getNode(int index)
        // private E removeAfter(Node<E> node)

        // Hint: if you implement this from scratch, remember to save:
        // predecessor node reference
        // current node reference

        size--;
        return removedValue;
    }

    // -------End of Assign 3 --------/

    // Don't change the code below.
    // Nested class Node, enclosing class: SimpleLinkedList
    private static class Node {

        private int data;
        private Node next;

        // constructor used to create a standalone node without a successor
        private Node(int data) {
            this.data = data;
            next = null;
        }

        // constructor used to create a Node with a given successor
        private Node(int dataNew, Node nextNew) {
            data = dataNew;
            next = nextNew;
        }

    }

    // the reference to the first Node in this linked list.
    private Node head;
    // the size of this linked list
    private int size;

    // create an empty linked list
    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    // append newItem
    public boolean add(int newItem) {
        Node temp = new Node(newItem);
        if (head == null) { // empty list
            head = temp;
        } else { // non-empty list
            // locate last node
            Node current = head; // start with the first node
            while (current.next != null) { // check if current node is not the last node
                current = current.next; // move on to the next node on the list
            }
            current.next = temp; // append the new node immediately following the current node
        }
        size++;
        return true;
    }

    // return a string that contains all integers (in the original sequence) in this
    // linked list.
    @Override
    public String toString() {
        String result = ""; // result string
        Node current = head; // start with first Node
        while (current != null) { // check if there is still nodes remaining
            result += current.data; // add the integer in current Node to the result string
            result += "-->";
            current = current.next; // move on to the next Node
        }
        return result;
    }
}
