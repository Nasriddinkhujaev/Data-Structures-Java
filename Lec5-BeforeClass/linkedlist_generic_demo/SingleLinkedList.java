package linkedlist_generic_demo;

public class SingleLinkedList<E> {

    // copied from SimpleLinkedList class.
    // to be modified in class
    // private static class Node {
    //
    // private int data;
    // private Node next;
    //
    // private Node(int data) {
    // this.data = data;
    // next = null;
    // }
    // }
    //
    // private Node head;
    // private int size;
    //
    // public SimpleLinkedList() {
    // head = null;
    // size = 0;
    // }
    //
    // public boolean add(int newItem) {
    // Node temp = new Node(newItem);
    //
    // if (head == null) {
    // head = temp;
    // } else {
    // Node current = head;
    // while (current.next != null) {
    // current = current.next;
    // }
    // current.next = temp;
    // }
    //
    // size++;
    // return true;
    // }
    //
    // @Override
    // public String toString() {
    // String listInfo = "";
    // Node current = head;
    // while (current != null) {
    // listInfo += current.data + "-->";
    // current = current.next;
    // }
    // return listInfo;
    // }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data) {
            this.data = data;
            next = null;
        }

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data.toString();
        }

    }

    public static void main(String[] args) {
        Node<Integer> first = new Node<>(20);
        Node<Integer> second = new Node<>(60);
        Node<Integer> third = new Node<>(100);

        first.next = second;
        second.next = third;

    }

    private Node<E> head;
    private int size;

    private Node<E> getNode(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private void addAfter(Node<E> node, E data) {
        node.next = new Node<>(data, node.next);
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> targetNode = getNode(index);
        return targetNode.data;
    }

    public E set(int index, E item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> targetNode = getNode(index);
        E result = targetNode.data;
        targetNode.data = item;
        return result;
    }

    public void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }

    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(index);
        }

        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> predecessorNode = getNode(index - 1);
            addAfter(predecessorNode, item);
        }
    }

}
