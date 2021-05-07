/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_101_Symmetric_Tree;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return check(root.left, root.right);
    }
    
    private boolean check(TreeNode leftNode,TreeNode rightNode){
        if (leftNode == null && rightNode == null) {
            return true;
        }
        if (leftNode == null || rightNode == null) {
            return false;
        }
        return leftNode.val == rightNode.val && check(leftNode.left, 
                rightNode.right) && check(leftNode.right, rightNode.left);
    }
}
