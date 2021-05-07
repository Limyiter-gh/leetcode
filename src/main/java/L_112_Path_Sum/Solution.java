/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_112_Path_Sum;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean hasPathSum(TreeNode root, int sum) {
        return pathFind(root, sum);
    }

    private boolean pathFind(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (sum - root.val == 0) {
                return true;
            }
        }
        return (pathFind(root.left, sum - root.val) || 
                pathFind(root.right, sum - root.val));
    }
}
