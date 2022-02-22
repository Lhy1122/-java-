/*
 * @Author: your name
 * @Date: 2022-02-22 20:38:25
 * @LastEditTime: 2022-02-22 20:40:55
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\04-Linked-List\06-Implement-Stack-in-LinkedList\Stack.java
 */
public interface Stack<E>{
    int getsize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}