/*
 * @Author: your name
 * @Date: 2022-02-14 18:36:13
 * @LastEditTime: 2022-02-14 18:49:25
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\02-Arrays\02-Create-Our-Own-Array\main.java
 */
public class main {
    public static void main(String[] args) {
        Array arr = new Array(10);
        System.out.println(arr.getcapacity());
        System.out.println(arr.isempty());
        System.out.println(arr.getsize());
    }
}
