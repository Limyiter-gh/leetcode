/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_77_Combinations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        if (n <= 0 || n < k) {
            return answer;
        }
        List<Integer> item = new ArrayList<>();
        dfs(n, k, 1, item, answer);
        return answer;
    }

    private void dfs(int n, int k, int start, List<Integer> item, List<List<Integer>> answer) {
        if (item.size() == k) {
            answer.add(new ArrayList<>(item));
            return;
        }
        for (int i = start; i <= n; i++) {
            item.add(i);
            dfs(n, k, i + 1, item, answer);
            item.remove(item.size() - 1);
        }
    }
}
