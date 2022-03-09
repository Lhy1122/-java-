/*
 * @Author: your name
 * @Date: 2022-03-09 23:19:06
 * @LastEditTime: 2022-03-09 23:20:03
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\07-Set-and-Map\02-LinkedListSet\Set.java
 */
public interface Set<E> {
    
    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();

}
