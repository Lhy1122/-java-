/*
 * @Author: your name
 * @Date: 2022-04-11 22:37:50
 * @LastEditTime: 2022-04-11 22:40:38
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\11-Union-Find\01-What-is-UnionFind\UF.java
 */
public interface UF {
    
    int getSize();
    boolean isConnected(int p, int q);
    void unionElements(int p, int q);
}
