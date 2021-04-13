package list;

public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T> {

    private int size;
    private Node head;
    private Node tail;

    @Override
    public void insert(T element) {
        Node node = new Node(element);
        if(head == null) {
            head = node;
            increment();
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
            increment();
        }
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    public void increment() {
        size++;
    }

    public void decrement() {
        size--;
    }

    private class Node {
        private final T data;
        private Node next;
        private Node previous;

        Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "[" + data + "]";
        }

    }
}