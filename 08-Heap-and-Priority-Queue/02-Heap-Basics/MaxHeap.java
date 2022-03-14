/*
 * @Author: your name
 * @Date: 2022-03-14 20:22:36
 * @LastEditTime: 2022-03-14 20:33:58
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\08-Heap-and-Priority-Queue\02-Heap-Basics\MaxHeap.java
 */
public class MaxHeap<E extends Comparable<E>>  {
    
    private Array<E> data;

    public MaxHeap(int capacity){
        data = new Array<>(capacity);
    }

    public MaxHeap(){
        data = new Array<>();
    }

    public int size(){
        return data.getsize();
    }

    public boolean isEmpty(){
        return data.isempty();
    }

    private int parent(int index){
        if(index == 0)
            throw new IllegalArgumentException("index-0 doesn't have parent.");
        return (index - 1) / 2;
    }

    private int leftChild(int index){
        return index * 2 + 1;
    }

    private int rightChild(int index){
        return index * 2 + 2;
    }
    
}
