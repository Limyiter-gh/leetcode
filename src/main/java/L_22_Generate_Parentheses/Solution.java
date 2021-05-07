/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_22_Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<String>();
        String item = new String();
        if (n <= 0) {
            return answer;
        }
        dfs(answer, item, n, n);
        return answer;
    }

    public void dfs(List<String> answer, String item, int left, int right) {
        if (left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            answer.add(new String(item));
            return;
        }
        if (left > 0) {
            dfs(answer, item + '(', left - 1, right);
        }
        if (right > 0) {
            dfs(answer, item + ')', left, right - 1);
        }
    }
}
