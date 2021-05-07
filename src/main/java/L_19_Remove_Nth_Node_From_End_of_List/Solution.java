/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_19_Remove_Nth_Node_From_End_of_List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode a = head;
        ListNode b = head;
        for (int i = 0; i < n; i++) {
            b = b.next;
        }
        if (b == null) {//删除头结点
            head = head.next;
            return head;
        }
        while (b.next != null) {
            a = a.next;
            b = b.next;
        }
        a.next = a.next.next;
        return head;
    }
}

// 删除后面N个
//        if (head == null) {
//            return null;
//        }
//        ListNode a = head;
//        ListNode b = head;
//        for (int i = 0; i < n; i++) {
//            if (a == null) {
//                return null;
//            }
//            a = a.next;
//        }
//        while (a != null) {
//            b = b.next;
//            a = a.next;
//        }
//
//        b.next = null;
//        return head;
