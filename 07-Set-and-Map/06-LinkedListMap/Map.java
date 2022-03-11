/*
 * @Author: your name
 * @Date: 2022-03-11 23:29:53
 * @LastEditTime: 2022-03-11 23:29:54
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\07-Set-and-Map\06-LinkedListMap\Map.java
 */
public interface Map<K,V> {
    void add(K key, V value);
    V remove(K key);
    boolean contains(K key);
    V get(K key);
    void set(K key, V newvalue);
    int getSize();
    boolean isEmpty();
}