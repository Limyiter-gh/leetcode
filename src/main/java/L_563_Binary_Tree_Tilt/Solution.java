/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_563_Binary_Tree_Tilt;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    //二叉树的坡度

    private int sum = 0;

    public int findTilt(TreeNode root) {
        helper(root);
        return sum;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        sum += Math.abs(left - right);
        return root.val + left + right;
    }
}
