/*
 * @Author: your name
 * @Date: 2022-02-20 12:52:41
 * @LastEditTime: 2022-02-20 14:52:21
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\04-Linked-List\01-Linked-List-Basics\LinkedList.java
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

}
