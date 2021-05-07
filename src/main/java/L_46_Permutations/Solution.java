/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_46_Permutations;

import com.sun.jndi.ldap.Ber;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> answer = new ArrayList<>();
//        if (nums == null || nums.length == 0) {
//            return answer;
//        }
//        helper(nums, new boolean[nums.length], new ArrayList<Integer>(), answer);
//        return answer;
        List<List<Integer>> answer = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return answer;
        }
        List<Integer> first = new ArrayList<>();
        first.add(nums[0]);
        answer.add(first);
        for (int i = 1; i < nums.length; i++) {
            List<List<Integer>> newAn = new ArrayList<>();
            for (int j = 0; j < answer.size(); j++) {
                List<Integer> cur = answer.get(i);
                for (int k = 0; k < cur.size() + 1; k++) {
                    List<Integer> item = new ArrayList<>(cur);
                    item.add(k, nums[i]);
                    newAn.add(item);
                }
            }
            answer = newAn;
        }
        return answer;
    }

//    private void helper(int[] nums, boolean[] used, List<Integer> item, List<List<Integer>> answer) {
//        if (item.size() == nums.length) {
//            answer.add(new ArrayList<Integer>(item));
//            return;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (!used[i]) {
//                used[i] = true;
//                item.add(nums[i]);
//                helper(nums, used, item, answer);
//                item.remove(item.size() - 1);
//                used[i] = false;
//            }
//        }
//    }
}
