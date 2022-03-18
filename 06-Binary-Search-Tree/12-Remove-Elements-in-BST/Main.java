/*
 * @Author: your name
 * @Date: 2022-03-08 20:49:55
 * @LastEditTime: 2022-03-09 22:12:27
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\06-Binary-Search-Tree\12-Remove-Elements-in-BST\Main.java
 */
public class Main {
    public static void main(String args[]){
        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for(int num: nums)
            bst.add(num);

        bst.remove(8);
        System.out.println(bst);
 

    }
}
