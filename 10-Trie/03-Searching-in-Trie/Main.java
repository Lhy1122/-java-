import java.util.ArrayList;

/*
 * @Author: your name
 * @Date: 2022-03-28 23:18:25
 * @LastEditTime: 2022-03-28 23:31:32
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \10-Trie\03-Searching-in-Trie\Main.java
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Pride and Prejudice");

        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile("pride-and-prejudice.txt", words)){
            long startTime = System.nanoTime();

            BSTSet<String> set = new BSTSet<>();
            for(String word : words)
                set.add(word);

            for(String word: words){
                set.contains(word);
            }



            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;

            System.out.println("Total different words: " + set.getSize());
            System.out.println("BSTSet: " + time + "s");


            //-------------
            startTime = System.nanoTime();

            Trie trie = new Trie();
            for(String word : words)
                trie.add(word);

            for(String word: words){
                trie.contains(word);
            }



            endTime = System.nanoTime();
            time = (endTime - startTime) / 1000000000.0;

            System.out.println("Total different words: " + trie.getSize());
            System.out.println("Trie: " + time + "s");
        }
    }
}
