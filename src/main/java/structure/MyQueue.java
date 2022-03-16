package structure;

import java.util.Arrays;

public class MyQueue<E> implements Queue<E> {
    private Object[] elementData;
    private int front;
    private int rear;
    private int size;

    public MyQueue(int capacity) {
        this.elementData = new Object[capacity];
    }

    @Override
    public void offer(E item) {
        if(size == elementData.length) {
            System.out.println("Full!");
            return;
        }
        rear = (rear+1)%elementData.length;
        elementData[rear] = item;
        size++;

        System.out.println(this);
    }

    @Override
    public E poll() {
        if(size == 0) {
            System.out.println("empty!");
            return null;
        }
        front = (front+1)%elementData.length;
        E item = (E) elementData[front];
        elementData[front] = null;
        size--;
        System.out.println(this);
        return item;
    }

    @Override
    public E peek() {
        front = (front+1)%elementData.length;
        E item = (E) elementData[front];
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}
