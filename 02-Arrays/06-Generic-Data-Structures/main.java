/*
 * @Author: your name
 * @Date: 2022-02-15 12:53:54
 * @LastEditTime: 2022-02-15 13:30:23
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\02-Arrays\06-Generic-Data-Structures\main.java
 */
public class main {
    public static void main(String[] args){
        Array<Integer> arr = new Array<>();
        arr.addFirst(114);
        arr.addLast(810);
        arr.add(1, 514);
        System.out.println(arr);
        arr.deleteElement(114);
        System.out.println(arr);
        arr.deleteLast();
        System.out.println(arr);

        Array<student> www = new Array<>();
        www.addFirst(new student("李华",77));
        www.addLast(new student("田野",88));
        System.out.println(www);
    }
}