/*
 * @Author: your name
 * @Date: 2022-02-17 11:14:23
 * @LastEditTime: 2022-02-17 13:53:51
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\03-Stacks-and-Queues\05-Array-Queue\ArrayQueue.java
 */
public class ArrayQueue<E> implements Queue<E> {
    private Array<E> array;

    public ArrayQueue(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayQueue(){
        array = new Array<>();
    }

    public int getsize(){
        return array.getsize();
    }

    public boolean isempty(){
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
