/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_173_Binary_Search_Tree_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Li Mingyang
 */
public class BSTIterator {

    List<TreeNode> list;
    int index = 0;

    public BSTIterator(TreeNode root) {
        list = inorder(root);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        if (index < list.size()) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return list.get(index++).val;
    }

    public List inorder(TreeNode root) {
        List<TreeNode> list = new ArrayList();
        if (root == null) {
            return list;
        }
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack();
        while (true) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.isEmpty()) {
                break;
            }
            cur = stack.pop();
            list.add(cur);
            cur = cur.right;
        }
        return list;
    }
}
