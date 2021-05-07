/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_387_First_Unique_Character_in_a_String;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int firstUniqChar(String s) {
        int pos = -1;
        int[] bits = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ++bits[c - 'a'];
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (bits[c - 'a'] == 1) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}
