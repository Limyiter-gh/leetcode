/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_24_Swap_Nodes_in_Pairs;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode ptr1 = fakeHead;
        ListNode ptr2 = head;
        while (ptr2 != null || ptr2.next != null) {
            ListNode nextstart = ptr2.next.next;
            ptr2.next.next = ptr2;
            ptr1.next = ptr2.next;
            ptr2.next = nextstart;
            ptr1 = ptr2;
            ptr2 = ptr2.next;
        }
        return fakeHead.next;
    }
}
