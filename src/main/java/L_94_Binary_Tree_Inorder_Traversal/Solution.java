/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_94_Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }
        trival(answer, root);
        return answer;
    }
    
    private void trival(List<Integer> list , TreeNode root){
        if (root.left != null) {
            trival(list, root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            trival(list, root.right);
        }
    }
}
