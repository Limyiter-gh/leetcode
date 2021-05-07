/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_6_ZigZag_Conversion;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <2 ) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            int temp = i;
            while (temp < s.length()) {                
                sb.append(s.charAt(temp));
                if (i != 0 && i != numRows - 1 && temp + 2 *(numRows - i - 1) < s.length()) {
                    sb.append(s.charAt(temp + 2 *(numRows - i - 1)));
                }
                temp += 2 * (numRows - 1);
            }
        }
        return sb.toString();
    }
}
