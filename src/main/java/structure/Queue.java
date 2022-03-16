package structure;

public interface Queue<E> {
    void offer(E item);
    E poll();
    E peek();
}
