package structure;

public interface Stack<E> {
    E push(E item);
    E pop();
    E peek();
    int search(E item);
    void clear();
    boolean empty();
    int size();
}
