/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_114_Flatten_Binary_Tree_to_Linked_List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    TreeNode lastvisited = null;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode realright = root.right;
        if (lastvisited != null) {
            lastvisited.left = null;
            lastvisited.right = root;
        }
        lastvisited = root;
        flatten(root.left);
        flatten(realright);
    }
}
