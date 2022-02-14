/*
 * @Author: your name
 * @Date: 2022-02-10 21:48:37
 * @LastEditTime: 2022-02-14 16:54:00
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java文件\01\Main.java
 * 
 * 
 * git status 查看git 文件状态
 * 
 * 
 */


public class Main {
    public static void main(String[] args) {

        Array<Integer> www = new Array<>(5);
        www.addFirst(114);


        www.addLast(9527);

        www.addLast(12);
        System.out.println(www);

        www.deleteLast();
        System.out.println(www);

        /*for(int i = 0; i < www.getsize(); i++){
            System.out.println(www.get(i));
        }

        System.out.println(www);

        System.out.println(www.get(0));

        www.set(2, 1919);
        System.out.println(www);

        System.out.println(www.contains(514));

        System.out.println(www.findindex(114));

        www.delete(1);
        System.out.println(www);

        www.add(1,514);
        www.addLast(810);
        System.out.println(www);

        www.deleteFirst();
        System.out.println(www.deleteLast());
        System.out.println(www);

        www.deleteElement(514);
        */
        

    }

}
