/*
 * @Author: your name
 * @Date: 2022-04-11 22:59:42
 * @LastEditTime: 2022-04-11 23:14:36
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\11-Union-Find\02-Quick-Find\UnionFind1.java
 */
public class UnionFind1 implements UF{
    private int[] id;

    public UnionFind1(int size){
        id = new int[size];

        for(int i = 0; i < id.length; i++){
            id[i] = i;

        }
    }

    @Override
    public int getSize(){
        return id.length;
    }

    private int find(int p){
        if(p < 0 && p >= id.length)
            throw new IllegalArgumentException("p is out of bound.");

        return id[p];
    }

    @Override
    public boolean isConnected(int p, int q){
        return find(p) == find(q);
    }

    @Override
    public void unionElements(int p, int q){
        int pID = find(p);
        int qID = find(q);

        if(pID == qID)
            return;

        for(int i = 0; i < id.length; i++){
            if(id[i] == pID)
                id[i] = qID;
        }
    }
}
