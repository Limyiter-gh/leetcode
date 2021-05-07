/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_21_Merge_Two_Sorted_Lists;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = null;
        ListNode r = null;
        ListNode p ,q;
        p = l1;
        q = l2;
        if (p.val <= q.val) {
            result = p;
            p = p.next;
        }else{
            result = q;
            q = q.next;
        }
        r = result;
        while (q != null && p != null) {            
            if (p.val <= q.val) {
                r.next = p;
                r = p;
                p = p.next;
            }else{
                r.next = q;
                r = q;
                q =q.next;
            }
        }
        if (p == null) {
            while (q!= null) {                
                r.next = q;
                r = q;
                q = q.next;
            }
        }
        if (q == null) {
            while (p!= null) {                
                r.next = p;
                r = p;
                p = p.next;
            }
        }
        return result;
    }
}
