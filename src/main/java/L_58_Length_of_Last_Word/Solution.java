/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_58_Length_of_Last_Word;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        if (s.trim().equalsIgnoreCase("") || s.length() == 0) {
            return 0;
        }
        String[] ss = s.split(" ");
        int len = ss.length;
        return ss[len - 1].length();
    }
}
