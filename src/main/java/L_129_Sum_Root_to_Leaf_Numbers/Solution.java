/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_129_Sum_Root_to_Leaf_Numbers;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int sumNumbers(TreeNode root) {
        return sumhelper(root, 0);
    }

    int sumhelper(TreeNode root, int levelBase) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return levelBase + root.val;
        }
        int nextLevelBase = (levelBase + root.val) * 10;
        int leftSubTreeSum = sumhelper(root.left, nextLevelBase);
        int rightSubTreeSum = sumhelper(root.right, nextLevelBase);

        return leftSubTreeSum + rightSubTreeSum;
    }
}
