/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_20_Valid_Parentheses;

import java.util.Stack;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.size() == 0) {
                    return false;
                }
                char cpop = stack.pop();
                if (cpop == '(' && c == ')') {
                    continue;
                } else if (cpop == '[' && c == ']') {
                    continue;
                } else if (cpop == '{' && c == '}') {
                    continue;
                } else{
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
