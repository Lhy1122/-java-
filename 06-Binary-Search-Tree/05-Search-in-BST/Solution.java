public class Solution {

    private class BST<E extends Comparable<E>> {

        private class Node {
            public E e;
            public Node left, right;

            public Node(E e) {
                this.e = e;
                left = null;
                right = null;
            }
        }

        private Node root;
        private int size;

        public BST(){
            root = null;
            size = 0;
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public void add(E e){
            root = add(root, e);
        }

        private Node add(Node node, E e){
            if(node == null){
                size ++;
                return new Node(e);
            }

            if(e.compareTo(node.e) < 0)
                node.left = add(node.left, e);
            else if(e.compareTo(node.e) > 0)
                node.right = add(node.right, e);

            return node;
        }

        public boolean contains(E e){
            return contains(root, e);
        }

        private boolean contains(Node node, E e){

            if(node == null)
                return false;

            if(e.compareTo(node.e) == 0)
                return true;
            else if(e.compareTo(node.e) < 0)
                return contains(node.left, e);
            else
                return contains(node.right, e);
        }
    }

    public int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        BST<String> bst = new BST<>();
        for(String word: words){
            StringBuilder res = new StringBuilder();
            for(int i = 0 ; i < word.length() ; i ++)
                res.append(codes[word.charAt(i) - 'a']);

            if(!bst.contains(res.toString()))
                bst.add(res.toString());
        }

        return bst.size();
    }
}