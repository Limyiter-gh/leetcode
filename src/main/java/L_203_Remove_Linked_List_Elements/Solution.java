/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_203_Remove_Linked_List_Elements;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return head;
            }
        }
        ListNode a = head;
        while (a.next != null) {
            if (a.next.val == val) {
                a.next = a.next.next;
            } else {
                a = a.next;
            }
            if (a == null) {
                return head;
            }
        }
        return head;
    }
}
