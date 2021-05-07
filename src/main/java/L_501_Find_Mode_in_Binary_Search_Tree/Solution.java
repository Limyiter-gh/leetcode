/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_501_Find_Mode_in_Binary_Search_Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    Map<Integer, Integer> map = new HashMap<>();
    int max = 0;

    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return new int[0];
        }
        inOrder(root);
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(key);
            }
        }
        int[] ret = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            ret[j] = list.get(j);
        }
        return ret;
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            if (map.containsKey(root.val)) {
                map.put(root.val, map.get(root.val) + 1);
            } else {
                map.put(root.val, 0);
            }
            max = Math.max(max, map.get(root.val));
            inOrder(root.right);
        }
    }
}
