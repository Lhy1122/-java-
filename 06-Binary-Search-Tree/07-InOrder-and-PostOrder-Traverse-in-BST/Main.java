/*
 * @Author: your name
 * @Date: 2022-03-04 22:38:55
 * @LastEditTime: 2022-03-04 22:44:42
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\06-Binary-Search-Tree\07-InOrder-and-PostOrder-Traverse-in-BST\Main.java
 */
public class Main {
    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for(int num: nums)
            bst.add(num);

        bst.preOrder();
        System.out.println();

        bst.inOrder();
        System.out.println();

        bst.postOrder();
        System.out.println();
    }
}