/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_216_Combination_Sum_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> answer = new ArrayList<>();
        if (k <= 0 || n <= 0) {
            return answer;
        }
        int[] candidates = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        helper(k, n, 0, candidates, new ArrayList<>(), answer);
        return answer;
    }

    private void helper(int k, int n, int start, int[] candidates, List<Integer> item, List<List<Integer>> answer) {
        if (item.size() == k && n == 0) {
            answer.add(new ArrayList<>(item));
            return;
        }
        if (n < 0 || item.size() > k) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            item.add(candidates[i]);
            helper(k, n - candidates[i], i + 1, candidates, item, answer);
            item.remove(item.size() - 1);
        }
    }
}
