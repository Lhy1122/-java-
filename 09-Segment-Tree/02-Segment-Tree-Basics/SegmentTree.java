/*
 * @Author: your name
 * @Date: 2022-03-19 21:34:14
 * @LastEditTime: 2022-03-20 22:00:32
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\09-Segment-Tree\02-Segment-Tree-Basics\SegmentTree.java
 */
public class SegmentTree<E> {
    private E[] tree;
    private E[] data;

    public SegmentTree(E[] arr){
        data = (E[]) new Object(arr.length);
        for(int i = 0; i < arr.length; i++)
            data[i] = arr[i];

        tree = (E[]) new Object[4 * arr.length];
    }

    public int getSize(){
        return data.length;
    }

    public E get(int index){
        if(index < 0 || index >= data.length)
            throw new IllegalArgumentException("Index is illegal.");

        return data[index];
    }

    private int leftChild(int index){
        return 2 * index + 1;
    }

    private int rightChild(int index){
        return 2 * index + 2;
    }
}
