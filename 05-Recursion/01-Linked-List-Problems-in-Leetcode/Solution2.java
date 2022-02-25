/*
 * @Author: your name
 * @Date: 2022-02-25 15:53:17
 * @LastEditTime: 2022-02-25 16:02:16
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\05-Recursion\01-Linked-List-Problems-in-Leetcode\Solution2.java
 */
class Solution2 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while(prev.next != null){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }
            else{
                prev = prev.next;
            }
        }

        return dummyHead.next;
    }
}