/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_102_Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answerList = new ArrayList<>();
        if (root == null) {
            return answerList;
        }
        
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int curLevCnt = 1;
        int nextLevCnt = 0;
        List<Integer> levelans = new ArrayList<>();
        
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            curLevCnt --;
            levelans.add(cur.val);
            
            if (cur.left != null) {
                queue.add(cur.left);
                nextLevCnt++;
            }
            
            if (cur.right != null) {
                queue.add(cur.right);
                nextLevCnt ++;
            }
            
            if (curLevCnt == 0) {
                curLevCnt = nextLevCnt;
                nextLevCnt = 0;
                answerList.add(levelans);
                levelans = new ArrayList<>();
            }
        }
        return answerList;
    }
}
