/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_230_Kth_Smallest_Element_in_a_BST;

import java.util.Stack;

/**
 * 修改中序遍历
 *
 * @author Li Mingyang
 */
public class Solution {

    public int kthSmallest(TreeNode root, int k) {
        int answer = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode temp = stack.pop();
                k--;
                if (k == 0) {
                    answer = temp.val;
                }
                p = temp.right;
            }
        }
        return answer;
    }
}
