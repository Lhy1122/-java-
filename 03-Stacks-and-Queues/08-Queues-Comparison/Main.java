/*
 * @Author: your name
 * @Date: 2022-02-18 19:54:48
 * @LastEditTime: 2022-02-18 20:13:55
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\03-Stacks-and-Queues\08-Queues-Comparison\Main.java
 */
import java.util.Random;

public class Main {
    
    private static double testQueue(Queue<Integer> q, int opCount){
        long startTime = System.nanoTime();

        Random random = new Random();
        for(int i = 0; i < opCount; i++){
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for(int i = 0; i < opCount; i++){
            q.dequeue();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args){
        int opCount = 100000;

        ArrayQueue<Integer> arrayqueue = new ArrayQueue<>();
        double time1 = testQueue(arrayqueue, opCount);
        System.out.println("ArrayQueue, time = " + time1 + " s");

        LoopQueue<Integer> loopqueue = new LoopQueue<>();
        double time2 = testQueue(loopqueue, opCount);
        System.out.println("LoopQueue, time = " + time2 + " s");
    }
}
