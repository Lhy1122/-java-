/*
 * @Author: your name
 * @Date: 2022-02-21 20:48:52
 * @LastEditTime: 2022-02-21 21:23:33
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\04-Linked-List\04-Query-and-Update-in-LinkedList\Main.java
 */
public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0 ; i < 5 ; i ++){
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }

        linkedList.add(3, 114);
        System.out.println(linkedList);
    }
}