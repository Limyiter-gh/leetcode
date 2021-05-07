/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_257_Binary_Tree_Paths;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        findPath(res, "", root);
        return res;
    }

    private void findPath(List<String> res, String tmp, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            res.add(tmp + Integer.toString(root.val));
            return;
        }
        findPath(res, tmp + Integer.toString(root.val) + "->", root.left);
        findPath(res, tmp + Integer.toString(root.val) + "->", root.right);
    }
}
