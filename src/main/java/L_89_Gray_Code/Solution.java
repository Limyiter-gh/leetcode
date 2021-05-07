/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_89_Gray_Code;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public List<Integer> grayCode(int n) {
        if (n == 0) {
            List<Integer> answer = new ArrayList<>();
            answer.add(0);
            return answer;
        }
        List<Integer> answer = grayCode(n - 1);
        int addNumber = 1 << (n - 1);
        int originalSize = answer.size();
        for (int i = originalSize - 1; i >= 0; i--) {
            answer.add(addNumber + answer.get(i));
        }
        return answer;
    }
}
