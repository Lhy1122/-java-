import java.util.Random;

/*
 * @Author: your name
 * @Date: 2022-03-14 21:34:23
 * @LastEditTime: 2022-03-15 16:29:33
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\08-Heap-and-Priority-Queue\04-Extract-and-Sift-Down-in-Heap\Main.java
 */
public class Main {

    private static double testHeap(Integer[] testData, boolean isHeapify){
        long startTime = System.nanoTime();

        MaxHeap<Integer> maxheap;
        if(isHeapify)
            maxheap = new MaxHeap<>(testData);
        else{
            maxheap = new MaxHeap<>();
            for(int num: testData)
                maxheap.add(num);
        }

        int[] arr = new int[testData.length];
        for(int i = 0; i < testData.length; i++)
            arr[i] = maxheap.extractMax();

        for(int i = 1; i < testData.length; i++)
            if(arr[i-1] < arr[i])
                throw new IllegalArgumentException("Error");

        System.out.println("Test MaxHeap completed.");

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String args[]){      

        int n = 1000000;

        Random random = new Random();
        Integer[] testData = new Integer[n];
        for(int i = 0; i < n; i++)
            testData[i] = random.nextInt(Integer.MAX_VALUE);

        double time1 = testHeap(testData, false);
        System.out.println("Without heapify: " + time1 + " s");

        double time2 = testHeap(testData, true);
        System.out.println("With heapify: " + time2 + " s");


    }
}
