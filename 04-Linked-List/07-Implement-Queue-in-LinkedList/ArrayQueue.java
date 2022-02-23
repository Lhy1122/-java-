/*
 * @Author: your name
 * @Date: 2022-02-23 21:13:38
 * @LastEditTime: 2022-02-23 21:15:57
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\04-Linked-List\07-Implement-Queue-in-LinkedList\ArrayQueue.java
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    public ArrayQueue(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayQueue(){
        array = new Array<>();
    }

    public int getSize(){
        return array.getsize();
    }

    public boolean isEmpty(){
        return array.isempty();
    }

    public int getcapacity(){
        return array.getcapacity();
    }

    public void enqueue(E e){
        array.addLast(e);
    }

    public E dequeue(){
        return array.deleteFirst();
    }

    public E getFront(){
        return array.getFirst();
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i = 0; i < array.getsize(); i++){
            res.append(array.get(i));
            if(i != array.getsize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }

    public static void main(String[] args){
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for(int i = 0; i < 10; i++){
            queue.enqueue(i);
            System.out.println(queue);
            if(i % 3 == 2 ){
                queue.dequeue();
                System.out.println(queue);
            }    
        }
    }
}
