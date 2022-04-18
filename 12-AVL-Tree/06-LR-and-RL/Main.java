import java.util.ArrayList;

/*
 * @Author: your name
 * @Date: 2022-04-18 23:07:04
 * @LastEditTime: 2022-04-18 23:17:39
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\12-AVL-Tree\06-LR-and-RL\Main.java
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Pride and Prejudice");

        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile("pride-and-prejudice.txt", words)){
            long startTime = System.nanoTime();

            BST<String, Integer> bst = new BST<>();
            for(String word : words){
                if(bst.contains(word))
                    bst.set(word, bst.get(word) + 1);
                else
                    bst.add(word, 1);
            }

            for(String word : words)
                bst.contains(word);

            long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("BST : " + time + " s");

            startTime = System.nanoTime();

            AVLTree<String, Integer> avl = new AVLTree<>();
            for(String word : words){
                if(avl.contains(word))
                    avl.set(word, avl.get(word) + 1);
                else
                    avl.add(word, 1);
            }

            for(String word : words)
                avl.contains(word);

            endTime = System.nanoTime();

            time = (endTime - startTime) / 1000000000.0;
            System.out.println("AVLTree : " + time + " s");
        }
    }
}
