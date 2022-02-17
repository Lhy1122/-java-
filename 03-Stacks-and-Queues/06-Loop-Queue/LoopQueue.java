public class LoopQueue<E> implements Queue<E> {
    private E[] data;
    private int front, tail;
    private int size;

    public LoopQueue(int capacity){
        data = (E[]) new Object(capacity + 1);
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getcapacity(){
        return data.length - 1;
    }

    @Override
    public boolean isempty(){
        return front == tail;
    }

    @Override
    public int getsize(){
        return size;
    }


}
