/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_14_Longest_Common_Prefix;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char x = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != x) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
