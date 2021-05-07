/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_404_Sum_of_Left_Leaves;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        //如果root为空，返回0
        if (root == null) {
            return 0;
        }
        //如果左子树即为左叶子节点，则返回左叶子节点的val值+sumOfLeftLeaves（右子树）的值
        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + sumOfLeftLeaves(root.right);
        } else //否则返回递归调用sumOfLeftLeaves（左子树）+sumOfLeftLeaves（右子树）的值
        {
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }
}
