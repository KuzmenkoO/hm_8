package homeWork8;

import java.util.Arrays;

public class MyStack<E> {
    private final int capacity = 1;
    private E[] element;
    private int size;

    public MyStack() {
        this.element = (E[]) new Object[capacity];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean clear() {
        this.element = (E[]) new Object[capacity];
        this.size = 0;
        return true;
    }

    public void push(Object value) {
        addHead((E) value);
        this.size++;
    }

    private void addHead(E value) {
        if (size >= element.length) {
            element = Arrays.copyOf(element, element.length + 1);
        }
        element[size] = value;
    }

    public boolean remove(int index) {

        if (index < size && index >= 0) {
            element[index] = null;
            for (int i = 0; i < this.size - 1; i++) {
                if (element[i] == null) {
                    element[i] = element[i + 1];
                    element[i + 1] = null;
                }
            }
            this.element = Arrays.copyOf(element, element.length - 1);
            this.size--;
            return true;
        }
        return false;
    }

    public E peek() {
        if (size != 0) {
            return element[size - 1];
        }
        return null;
    }

    public E pop() {
        E lastElement = peek();
        remove(size - 1);
        return lastElement;
    }

    @Override
    public String toString() {
        return Arrays.toString(element);
    }
}



