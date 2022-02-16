public interface Stack<E> {
    int getsize();
    boolean isempty();
    void push(E e);
    E pop();
    E peek();
}
