/*
 * @Author: your name
 * @Date: 2022-02-22 20:43:42
 * @LastEditTime: 2022-02-22 21:05:57
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\04-Linked-List\06-Implement-Stack-in-LinkedList\LinkedListStack.java
 */
public class LinkedListStack<E> implements Stack<E> {
    private LinkedList<E> list;

    public LinkedListStack(){
        list = new LinkedList<>();
    }

    
    public int getsize(){
        return list.getSize();
    }

    
    public boolean isEmpty(){
        return list.isEmpty();
    }

    
    public void push(E e){
        list.addFirst(e);
    }

    
    public E pop(){
        return list.removeFirst();
    }

    
    public E peek(){
        return list.getFirst();
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: top ");
        res.append(list);
        return res.toString();
    }

    public static void main(String[] args){
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for(int i = 0; i < 5; i++){
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);

        stack.peek();
        System.out.println(stack);
    }
}
/*
 * @Author: your name
 * @Date: 2022-02-22 20:43:42
 * @LastEditTime: 2022-02-22 20:43:42
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\04-Linked-List\06-Implement-Stack-in-LinkedList\LinkedListStack.java
 */
