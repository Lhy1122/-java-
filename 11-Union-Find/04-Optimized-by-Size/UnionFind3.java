/*
 * @Author: your name
 * @Date: 2022-04-12 21:43:30
 * @LastEditTime: 2022-04-12 21:51:59
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\11-Union-Find\04-Optimized-by-Size\UnionFind3.java
 */
public class UnionFind3 {
    private int[] parent;
    private int[] sz;

    public UnionFind3 (int size){
        parent = new int[size];
        sz = new int[size];

        for(int i = 0; i < size; i++){
            parent[i] = i;
            sz[i] = 1;
        }
    }

    
    public int getSize(){
        return parent.length;
    }

    private int find(int p){
        if(p < 0 || p >= parent.length)
            throw new IllegalArgumentException("p is out of bound.");

        while(p != parent[p])
            p = parent[p];
        return p;
    }

    
    public boolean isConnected(int p, int q){
        return find(p) == find(q);
    }

    
    public void unionElements(int p, int q){
        int pRoot = find(p);
        int qRoot = find(q);

        if(pRoot == qRoot)
            return;

        if(sz[pRoot] < sz[qRoot]){
            parent[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        }
        else{
            parent[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
        
    }
}