/*
 * @Author: your name
 * @Date: 2022-03-15 16:37:39
 * @LastEditTime: 2022-03-15 16:39:22
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\08-Heap-and-Priority-Queue\06-Priority-Queue\Queue.java
 */
public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}