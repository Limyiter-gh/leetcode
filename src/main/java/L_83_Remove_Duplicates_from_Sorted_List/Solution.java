/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_83_Remove_Duplicates_from_Sorted_List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode base = head;
        ListNode cur = head.next;
        while (base != null && cur != null) {            
            if (base.val == cur.val) {
                base.next = cur.next;
            }else{
                base = base.next;
            }
            cur= cur.next;
        }
        return head;
    }
}
