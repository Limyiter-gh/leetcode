/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_241_Different_Ways_to_Add_Parentheses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> answer = new ArrayList<>();
        int val = 0, index = 0;
        while (index < input.length() && Character.isDigit(input.charAt(index))) {
            val *= 10;
            val += input.charAt(index++) - '0';
        }
        if (index == input.length()) {
            answer.add(val);
            return answer;
        }
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1, input.length()));
                for (int j = 0; j < left.size(); j++) {
                    for (int k = 0; k < right.size(); k++) {
                        answer.add(comput(left.get(j), right.get(k), input.charAt(i)));
                    }
                }
            }
        }
        return answer;
    }

    int comput(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return 1;
        }
    }
}
