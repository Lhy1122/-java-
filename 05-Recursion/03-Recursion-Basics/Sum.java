/*
 * @Author: your name
 * @Date: 2022-02-27 14:46:02
 * @LastEditTime: 2022-02-27 14:52:32
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\05-Recursion\03-Recursion-Basics\Sum.java
 */
public class Sum {

    public static int sum(int[] arr){
        return sum(arr, 0);
    }

    private static int sum(int[] arr, int l){
        if(l == arr.length)
            return 0;
        return arr[l] + sum(arr, l + 1);
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(sum(nums));
    }
}
