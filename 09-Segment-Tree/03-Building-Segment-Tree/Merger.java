/*
 * @Author: your name
 * @Date: 2022-03-20 22:27:34
 * @LastEditTime: 2022-03-20 22:43:19
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\09-Segment-Tree\03-Building-Segment-Tree\Merger.java
 */
public interface Merger<E> {
    E merge(E a, E b);
}
