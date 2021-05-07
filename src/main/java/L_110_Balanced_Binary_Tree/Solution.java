/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_110_Balanced_Binary_Tree;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int depthOfLeft = getDepth(root.left, 1);
        int depthOfRight = getDepth(root.right, 1);

        if (Math.abs(depthOfLeft - depthOfRight) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int getDepth(TreeNode tree, int currentDepth) {
        if (tree == null) {
            return currentDepth;
        }
        return Math.max(getDepth(tree.left, currentDepth + 1),
                getDepth(tree.right, currentDepth + 1));
    }
}
