/*
 * @Author: your name
 * @Date: 2022-03-12 17:46:21
 * @LastEditTime: 2022-03-12 17:47:36
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\07-Set-and-Map\08-More-about-Map\Map.java
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