import javax.management.ListenerNotFoundException;

/*
 * @Author: your name
 * @Date: 2022-02-27 15:33:03
 * @LastEditTime: 2022-02-27 15:47:49
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\05-Recursion\04-LinkedList-and-Recursion\Solution3.java
 */
public class Solution3 {
    public ListNode removeElements(ListNode head, int val){
        if(head == null)
            return head;
        ListNode res = removeElements(head.next, val);

        if(head.val == val)
            return res;
        else{
            head.next = res;
            return head;
        }
    }

    public static void main(String[] args){
        int nums[] = {114,514,19,19,810};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution3()).removeElements(head, 19);
        System.out.println(res);
        }
}
