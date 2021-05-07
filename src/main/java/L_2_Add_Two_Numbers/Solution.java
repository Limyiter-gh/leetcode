package L_2_Add_Two_Numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode();
        //准备数字加和
        int l1num = 0;
        int l2num = 0;
        while (l1 != null) {
            l1num = l1num * 10 + l1.val;
            l1 = l1.next;
        }
        while (l2 != null) {
            l2num = l2num * 10 + l2.val;
            l2 = l2.next;
        }
        int result = l1num + l2num;
        //将加和结果转换为链表
        List<ListNode> resultList = new ArrayList<>();
        while (result > 0) {
            int temp = result % 10;
            result = result /10;
            resultList.add(new ListNode(temp));
        }

        ln = resultList.get(0);
        for (int i = 0; i + 1 < resultList.size(); i++) {
            resultList.get(i).next = resultList.get(i + 1);
        }

        return ln;
    }

    public static void main(String[] args) {
        ListNode l1_3 = new ListNode(3);
        ListNode l1_4 = new ListNode(4, l1_3);
        ListNode l1_2 = new ListNode(2, l1_4);

        ListNode l2_4 = new ListNode(4);
        ListNode l2_6 = new ListNode(6, l2_4);
        ListNode l2_5 = new ListNode(5, l2_6);

        ListNode answer = addTwoNumbers(l1_2, l2_5);
    }
}
