package structure;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<E> implements Stack<E> {
    private Object[] elementData;
    private int index;
    private final int MAX_CAPACITY = 10;

    public MyStack() {
        new MyStack(MAX_CAPACITY);
    }

    public MyStack(int capacity) {
        this.elementData = new Object[capacity];
    }

    private void grow() {
        elementData = Arrays.copyOf(elementData, index*2);
    }

    private void reduce() {
        elementData = Arrays.copyOf(elementData, index);
    }

    @Override
    public E push(E item) {
        if(index == size())
            grow();
        elementData[index++] = item;
        return item;
    }

    @Override
    public E pop() {
        E item = peek();
        elementData[--index] = null;
        if(index == size()/2)
            reduce();
        return item;
    }

    @Override
    public E peek() {
        if(index == 0)
            throw new EmptyStackException();
        return (E) elementData[index-1];
    }

    @Override
    public int search(E item) {
        for (int i = index-1; i > 0 ; i--) {
            if(elementData[i].equals(item))
                return i;
        }
        return -1;
    }

    @Override
    public void clear() {
        Arrays.fill(elementData, null);
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return elementData.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}
