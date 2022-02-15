/*
 * @Author: your name
 * @Date: 2022-02-15 18:02:44
 * @LastEditTime: 2022-02-15 18:05:06
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\03-Stacks-and-Queues\02-Array-Stack\Stack.java
 */
public interface Stack<E> {
    int getsize();
    boolean isempty();
    void push(E e);
    E pop();
    E peek();
}
