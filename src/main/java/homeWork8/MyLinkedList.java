package homeWork8;

public class MyLinkedList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public MyLinkedList() {
        this.last = new Node(first, null, null);
        this.first = new Node(null, null, last);
        this.size = 0;
    }

    public void add(E value) {
        Node<E> prevNode = last;
        prevNode.setElement(value);
        last = new Node<>(prevNode, null, null);
        prevNode.setNext(last);
        size++;
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        Node<E> target = first.getNext();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getElement();
    }

    private Node<E> getNextElement(Node<E> index) {
        return index.getNext();
    }

    public int size() {

        return size;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            Node<E> nodeToRemove = getNode(index);
            Node<E> nodePrevious = nodeToRemove.getPrev();
            Node<E> nodeNext = nodeToRemove.getNext();
            nodePrevious.setNext(nodeNext);
            nodeNext.setPrev(nodePrevious);
            size--;
            return true;
        } else {
            return false;
        }
    }

    private Node<E> getNode(int index) {
        Node<E> target = first.getNext();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            Node<E> node = getNode(0);
            node.setPrev(null);
            node.setElement(null);
            node.setNext(null);
        }
        size = 0;
    }

    private static class Node<E> {
        Node<E> next;
        Node<E> prev;
        private E element;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}

