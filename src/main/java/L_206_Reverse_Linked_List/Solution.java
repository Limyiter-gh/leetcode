/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_206_Reverse_Linked_List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        } else if (head.next.next == null) {
            ListNode newHead = head.next;
            newHead.next = head;
            head.next = null;
            return newHead;
        }else{
            ListNode pre = head;
            ListNode cur = pre.next;
            pre.next = null;
            ListNode post = cur.next;
            while (post!=null) {                
                cur.next = pre;
                pre = cur;
                cur = post;
                post = post.next;
            }
            cur.next = pre;
            return cur;
        }
    }
}
