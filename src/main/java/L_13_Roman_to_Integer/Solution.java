/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_13_Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int len = s.length();
        result += roman.get(s.charAt(0));
        for (int i = 1; i < len; i++) {
            int cur = roman.get(s.charAt(i));
            int pre = roman.get(s.charAt(i - 1));
            if (cur <= pre) {
                result += cur;
            } else {
                result = result + cur - 2 * pre;
            }
        }
        return result;
    }
}
