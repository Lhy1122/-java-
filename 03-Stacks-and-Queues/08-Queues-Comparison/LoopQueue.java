/*
 * @Author: your name
 * @Date: 2022-02-17 16:51:48
 * @LastEditTime: 2022-02-18 15:32:28
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\03-Stacks-and-Queues\06-Loop-Queue\LoopQueue.java
 */
public class LoopQueue<E> implements Queue<E> {
    private E[] data;
    private int front, tail;
    private int size;

    public LoopQueue(int capacity){
        data = (E[])new Object[capacity + 1];
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

    public boolean isempty(){
        return front == tail;
    }

    public int getsize(){
        return size;
    }

    public void enqueue(E e){
        if((tail + 1) % data.length == front)
            resize(getcapacity() * 2);
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    public E dequeue(){
        if(isempty())
            throw new IllegalArgumentException("Cannot dequeue form an empty queue.");
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        if(size == getcapacity() / 4 && getcapacity() / 2 != 0)
            resize(getcapacity() / 2);
        return ret;
    }

    public E getFront(){
        if(isempty())
            throw new IllegalArgumentException("Queue is empty");
        return data[front];
    }

    private void resize(int newcapacity){
        E[] newdata = (E[]) new Object[newcapacity + 1];
        for(int i = 0; i < size; i++){
            newdata[i] = data[(i + front) % data.length];
        }

        data = newdata;
        front = 0;
        tail = size;
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue size = %d , capacity = %d\n", size, getcapacity()));
        res.append("front [");
        for(int i = front; i != tail; i = (i + 1) % data.length){
            res.append(data[i]);
            if((i + 1) % data.length != tail)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }

}
