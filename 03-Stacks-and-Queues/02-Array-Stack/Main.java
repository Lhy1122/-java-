/*
 * @Author: your name
 * @Date: 2022-02-15 17:49:44
 * @LastEditTime: 2022-02-15 20:31:58
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\03-Stacks-and-Queues\02-Array-Stack\Main.java
 */
public class Main {
    public static void main(String[] args){
        ArrayStack<Integer> stack = new ArrayStack<>();
        for(int i = 0; i < 5; i++){
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
