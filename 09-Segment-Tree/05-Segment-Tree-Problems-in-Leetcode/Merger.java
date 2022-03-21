/*
 * @Author: your name
 * @Date: 2022-03-21 21:00:21
 * @LastEditTime: 2022-03-21 21:00:36
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\09-Segment-Tree\05-Segment-Tree-Problems-in-Leetcode\Merger.java
 */
public interface Merger<E> {
    E merge(E a, E b);
}
