/*
 * @Author: your name
 * @Date: 2022-02-15 14:31:58
 * @LastEditTime: 2022-02-15 14:37:27
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\02-Arrays\07-Dynamic-Array\main.java
 */
public class main {
    public static void main(String[] args){
        Array<Integer> arr = new Array<>(5);
        for(int i = 0; i < 5; i++){
            arr.addLast(i);
        }
        System.out.println(arr);
        arr.addLast(5);
        System.out.println(arr);
        for(int i = 0; i < 4; i++){
            arr.deleteLast();
        }
        System.out.println(arr);
    }
}
