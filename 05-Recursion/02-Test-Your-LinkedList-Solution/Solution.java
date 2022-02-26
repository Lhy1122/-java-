/*
 * @Author: your name
 * @Date: 2022-02-26 23:22:52
 * @LastEditTime: 2022-02-26 23:25:59
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\05-Recursion\02-Test-Your-LinkedList-Solution\Solution.java
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if(head == null){
            return head;
        }

        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }
            else{
                prev = prev.next;
            }
        }

        return head;
    }

    public static void main(String[] args){
        int[] nums = {114,514,19,19,810};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution()).removeElements(head, 19);
        System.out.println(res);
    }
}