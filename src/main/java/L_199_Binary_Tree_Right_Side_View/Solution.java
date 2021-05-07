/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_199_Binary_Tree_Right_Side_View;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer;
        if (root == null) {
            return (new ArrayList<>());
        } else if (root.left == null && root.right == null) {
            answer = new ArrayList<>();
        } else if (root.left == null && root.right != null) {
            answer = rightSideView(root.right);
        } else if (root.left != null && root.right == null) {
            answer = rightSideView(root.left);
        } else {
            List<Integer> one = rightSideView(root.left);
            List<Integer> two = rightSideView(root.right);
            if (one.size() <= two.size()) {
                answer = two;
            } else {
                one = one.subList(two.size(), one.size());
                two.addAll(one);
                answer = two;
            }
        }
        answer.add(0, root.val);
        return answer;
    }
}
