/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_1021_Remove_Outermost_Parentheses;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        char[] word = S.toCharArray();
        int val = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == '(') {
                val++;
                if (val != 1) {
                    sb.append(word[i]);
                }
            } else {
                val--;
                if (val != 0) {
                    sb.append(word[i]);
                }
            }
        }
        return sb.toString();
    }
}
