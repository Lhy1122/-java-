/*
 * @Author: your name
 * @Date: 2022-02-26 23:22:45
 * @LastEditTime: 2022-02-26 23:23:04
 * @LastEditors: your name
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\05-Recursion\02-Test-Your-LinkedList-Solution\ListNode.java
 */
public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; 
    }

    public ListNode(int[] arr){
        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("arr can not be empty.");
        
        this.val = arr[0];

        ListNode cur = this;
        for(int i = 0; i < arr.length; i++){
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while(cur != null){
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("NULL");
        return res.toString();
    }
}