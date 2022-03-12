import java.util.ArrayList;

/*
 * @Author: your name
 * @Date: 2022-03-12 17:46:21
 * @LastEditTime: 2022-03-12 18:06:23
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\07-Set-and-Map\08-More-about-Map\Main.java
 */
public class Main {

    private static double testMap(Map<String, Integer> map, String filename){
        long startTime = System.nanoTime();

        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile(filename, words)){
            System.out.println("Total words: " + words.size());

            for(String word : words){
                if(map.contains(word))
                    map.set(word, map.get(word) + 1);
                else
                    map.add(word, 1);
            }

            System.out.println("Total different words: " + map.getSize());
            System.out.println("Frequency of PRIDE: " + map.get("price"));
            System.out.println("Frequency of PREJUDICE:" + map.get("prejudice"));

        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String args[]){
        String filename = "pride-and-prejudice.txt";
        BSTMap<String, Integer> bstMap = new BSTMap<>();
        double time1 = testMap(bstMap, filename);
        System.out.println("BST Map: " + time1 + "s");

        System.out.println();

        LinkedListMap<String, Integer> linkedlistMap = new LinkedListMap<>();
        double time2 = testMap(linkedlistMap, filename);
        System.out.println("Linked List Map " + time2 + "s");
    }
}
