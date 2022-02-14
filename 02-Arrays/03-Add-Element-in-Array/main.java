/*
 * @Author: your name
 * @Date: 2022-02-14 19:21:19
 * @LastEditTime: 2022-02-14 19:55:43
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\02-Arrays\03-Add-Element-in-Array\main.java
 */
public class main {
    public static void main(String[] args){
        Array arr = new Array();
        arr.addFirst(114);
        arr.addLast(810);
        arr.add(1, 514);
        System.out.println(arr);
    }
}
