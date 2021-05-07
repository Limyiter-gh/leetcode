/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_111_Minimum_Depth_of_Binary_Tree;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }else{
            int leftDepth = root.left != null ? minDepth(root.left) 
                    : Integer.MAX_VALUE;
            int rightDepth = root.right != null? minDepth(root.right) 
                    : Integer.MAX_VALUE;
            return Math.min(leftDepth, rightDepth) +1;
        }
    }
}

//        if (root == null) {
//            return 0;
//        }
//        if (root.left == null && root.right == null) {
//            return 1;
//        }else{
//            int leftDepth = root.left != null ? minDepth(root.left) 
//                    : Integer.MAX_VALUE;
//            int rightDepth = root.right != null? minDepth(root.right) 
//                    : Integer.MAX_VALUE;
//            return Math.min(leftDepth, rightDepth) +1;
//        }

//        if (root == null) {
//            return 0;
//        }else if (root.left == null && root.right == null) {
//            return 1;
//        }else if (root.left == null || root.right == null) {
//            return 1;
//        }else{
//            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
//        }