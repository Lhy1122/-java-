/*
 * @Author: your name
 * @Date: 2022-02-20 14:53:03
 * @LastEditTime: 2022-02-20 15:31:59
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\04-Linked-List\03-DummyHead-in-LinkedList\LinkedList.java
 */
public class LinkedList<E> {
    
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }
        
        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node dummyHead;
    int size;

    private LinkedList(){
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getsize(){
        return size;
    }

    public boolean isempty(){
        return size == 0;
    }


    public void add(int index, E e){
        if(index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Illegal index.");

        
            Node prev = dummyHead;

            for(int i = 0; i < index; i++){
                prev = prev.next;
            }

            prev.next = new Node(e, prev.next);
            size++;
        }
    
    public void addFirst(E e){
        add(0, e);
    }

    public void addLast(E e){
        add(size, e);
    }

}