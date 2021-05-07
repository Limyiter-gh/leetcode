/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_242_Valid_Anagram;

import java.util.Arrays;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] intArray = new int[26];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 0;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        for (char u : sChar) {
            intArray[u-'a'] ++;
        }
        for (char u : tChar) {
            intArray[u-'a'] --;
        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
