/*
 * @Author: your name
 * @Date: 2022-03-11 22:24:12
 * @LastEditTime: 2022-03-11 23:30:46
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\07-Set-and-Map\06-LinkedListMap\LinkedListMap.java
 */
public class LinkedListMap<K, V> implements Map<K, V> {
    private class Node{
        public K key;
        public V value;
        public Node next;

        public Node(K key, V value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public Node(K key){
            this(key, null, null);
        }

        public Node(){
            this(null, null, null);
        }

        @Override
        public String toString(){
            return key.toString() + ":" + value.toString();
        }

        
        }

    private Node dummyHead;
    private int size;

    public LinkedListMap(){
        dummyHead = new Node();
        size = 0;
    }

    @Override
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private Node getNode(K key){
        Node cur = dummyHead.next;
        while(cur != null){
            if(cur.key.equals(key))
                return cur;
            
            cur = cur.next;
        }
        return null;
    }

    @Override
    public boolean contains(K key){
        return getNode(key) != null;
    }

    @Override
    public V get(K key){
        Node node = getNode(key);
        return node == null ? null : node.value;
    }

    @Override
    public void add(K key, V value){
        Node node = getNode(key);
        if(node == null){
            dummyHead.next = new Node(key, value, dummyHead.next);
            size++;
        }
        else{
            node.value = value;
        }
    }

    @Override
    public void set(K key, V newvalue){
        Node node = getNode(key);
        if(node == null)
            throw new IllegalArgumentException(key + " doesn't exist!");
        node.value = newvalue;
    }

    public V remove(K key){
        Node prev = dummyHead;
        while(prev.next != null){
            if(prev.next.equals(key))
                break;
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size--;
            return delNode.value;
        }

        return null;
    }
}
