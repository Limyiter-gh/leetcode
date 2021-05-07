/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_8_String_to_Integer_atoi;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int myAtoi(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        str = str.trim();
        char flag = '+';
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        double answer = 0;
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            answer = answer * 10 + (str.charAt(i) - '0');
            i++;
        }
        if (flag == '-') {
            answer = -answer;
        }
        if (answer > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (answer < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) answer;
    }
}
