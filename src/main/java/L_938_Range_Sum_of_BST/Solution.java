/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_938_Range_Sum_of_BST;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    private int answer = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        if (root == null) {
            return answer;
        }
        
        if(root.val >= L && root.val <= R){
            answer += root.val;
        }
        
        rangeSumBST(root.left, L, R);
        rangeSumBST(root.right, L, R);
        
        return answer;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
