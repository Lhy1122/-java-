/*
 * @Author: your name
 * @Date: 2022-03-14 21:12:50
 * @LastEditTime: 2022-03-15 16:30:43
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\08-Heap-and-Priority-Queue\04-Extract-and-Sift-Down-in-Heap\MaxHeap.java
 */
public class MaxHeap<E extends Comparable<E>>  {
    
    private Array<E> data;

    public MaxHeap(int capacity){
        data = new Array<>(capacity);
    }

    public MaxHeap(){
        data = new Array<>();
    }

    public MaxHeap(E[] arr){
        data = new Array<>(arr);
        for(int i = parent(arr.length - 1); i >= 0; i--)
            siftDown(i);
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

    public void add(E e){
        data.addLast(e);
        siftUp(data.getsize() - 1);
    }

    private void siftUp(int k){
        while(k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0){
            data.swap(k, parent(k));
            k = parent(k);
        }
    }

    public E findMax(){
        if(data.getsize() == 0)
            throw new IllegalArgumentException("Can not findMax when heap is empty.");

        return data.get(0);
    }

    public E extractMax(){
        E ret = findMax();
        data.swap(0, data.getsize() - 1);
        data.deleteLast();
        siftDown(0);

        return ret;
    }

    public void siftDown(int k){
        while(leftChild(k) < data.getsize()){
            int j = leftChild(k);
            if(j + 1 < data.getsize() && data.get(j + 1).compareTo(data.get(j)) > 0)
                j = rightChild(k);

            if(data.get(k).compareTo(data.get(j)) >= 0)
                break;

            data.swap(k, j);
            k = j; 
        }
    }

    public E replace(E e){
        E ret = findMax();
        data.set(0, e);
        siftDown(0);
        return ret;
    }
    
}