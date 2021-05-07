/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_541_Reverse_String_II;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder("");
        int start = 0;
        while (start <= s.length()) {
            int i = 0, j = 0;
            if (s.length() - start <= k) {
                i = s.length() - 1;
                j = s.length();
            } else {
                i = start + k - 1;
                j = start + k;
            }
            for (; i >= start; i--) {
                sb.append(s.charAt(i));
            }
            for (; j < s.length() && j < start + 2 * k; j++) {
                sb.append(s.charAt(j));
            }
            start += 2 * k;
        }
        return sb.toString();
    }
}
