import java.util.ArrayList;

import javax.tools.FileObject;

/*
 * @Author: your name
 * @Date: 2022-03-11 23:19:00
 * @LastEditTime: 2022-03-11 23:29:07
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\07-Set-and-Map\06-LinkedListMap\Main.java
 */
public class Main {
    public static void main(String args[]){
        System.out.println("Pride and Prejudice");

        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile("pride-and-prejudice.txt", words)){
            System.out.println("Total words: " + words.size());
        }

        LinkedListMap<String, Integer> map = new LinkedListMap<>();
        for(String word : words){
            if(map.contains(word))
                map.set(word, map.get(word) + 1);
            else
                map.add(word, 1);
        }

        System.out.println("Total different words: " + map.getSize());
        System.out.println("Frequency of PRIDE: " + map.get("pride"));
        System.out.println("Frequency of PREJUDICE: " + map.get("prejudice"));
    }
}
