import java.util.Random;

/*
 * @Author: your name
 * @Date: 2022-03-14 21:34:23
 * @LastEditTime: 2022-03-14 21:46:10
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\08-Heap-and-Priority-Queue\04-Extract-and-Sift-Down-in-Heap\Main.java
 */
public class Main {
    public static void main(String args[]){
        int n = 1000000;

        MaxHeap<Integer> maxheap = new MaxHeap<>();
        Random random = new Random();
        for(int i = 0; i < n; i++)
            maxheap.add(random.nextInt(Integer.MAX_VALUE));

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = maxheap.extractMax();

        for(int i = 1; i < n; i++)
            if(arr[i-1] < arr[i])
                throw new IllegalArgumentException("Error");

        System.out.println("Test MaxHeap completed.");
    }
}
