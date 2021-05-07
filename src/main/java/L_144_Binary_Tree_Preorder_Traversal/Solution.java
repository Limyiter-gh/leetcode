/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_144_Binary_Tree_Preorder_Traversal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }
        trival(root, answer);
        return answer;
    }

    private void trival(TreeNode root, List<Integer> list) {
        list.add(root.val);
        if (root.left != null) {
            trival(root.left, list);
        }
        if (root.right != null) {
            trival(root.right, list);
        }
    }
}
