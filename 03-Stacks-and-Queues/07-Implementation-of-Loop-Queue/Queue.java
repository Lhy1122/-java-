public interface Queue<E> {
    int getsize();
    boolean isempty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}

