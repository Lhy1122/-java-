/*
 * @Author: your name
 * @Date: 2022-03-02 23:23:36
 * @LastEditTime: 2022-03-02 23:30:09
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\06-Binary-Search-Tree\02-Binary-Search-Tree-Basics\BST.java
 */
public class BST<E extends Comparable<E>> {
    
    private class Node{
        public E e;
        public left, right;

        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
