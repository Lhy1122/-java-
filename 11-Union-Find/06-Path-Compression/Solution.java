import java.util.TreeSet;

class Solution {

    private interface UF {
        int getSize();
        boolean isConnected(int p, int q);
        void unionElements(int p, int q);
    }

    private class UnionFind4 implements UF {

        private int[] rank;
        private int[] parent;

        public UnionFind4(int size){

            rank = new int[size];
            parent = new int[size];

            for( int i = 0 ; i < size ; i ++ ){
                parent[i] = i;
                rank[i] = 1;
            }
        }

        @Override
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

        @Override
        public boolean isConnected( int p , int q ){
            return find(p) == find(q);
        }

        @Override
        public void unionElements(int p, int q){

            int pRoot = find(p);
            int qRoot = find(q);

            if( pRoot == qRoot )
                return;

            if(rank[pRoot] < rank[qRoot])
                parent[pRoot] = qRoot;
            else if(rank[qRoot] < rank[pRoot])
                parent[qRoot] = pRoot;
            else{
                parent[pRoot] = qRoot;
                rank[qRoot] += 1;
            }
        }
    }

    public int findCircleNum(int[][] M) {

        int n = M.length;
        UnionFind4 uf = new UnionFind4(n);
        for(int i = 0 ; i < n ; i ++)
            for(int j = 0 ; j < i ; j ++)
                if(M[i][j] == 1)
                    uf.unionElements(i, j);

        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0 ; i < n ; i ++)
            set.add(uf.find(i));
        return set.size();
    }
}