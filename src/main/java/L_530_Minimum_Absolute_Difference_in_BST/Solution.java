/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_530_Minimum_Absolute_Difference_in_BST;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    //二叉搜索树的特点是，小的值在左边，大的值在右边

    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        array(root, list);

        int gap = 65535, temp;
        for (int i = 0; i < list.size() - 1; i++) {
            temp = list.get(i + 1) - list.get(i);
            if (gap > temp) {
                gap = temp;
            }
        }

        return gap;
    }

    public void array(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            array(root.left, list);
        }

        list.add(root.val);

        if (root.right != null) {
            array(root.right, list);
        }

    }
}
