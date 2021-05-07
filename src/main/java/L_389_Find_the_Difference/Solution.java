/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_389_Find_the_Difference;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public char findTheDifference(String s, String t) {
        int count1[] = new int[26];
        int count2[] = new int[26];
        int i;
        for (i = 0; i < s.length(); i++) {
            count1[s.charAt(i) - 'a']++;
        }
        for (i = 0; i < t.length(); i++) {
            count2[t.charAt(i) - 'a']++;
        }
        for (i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return (char) ('a' + i);
            }
        }
        return 0;
    }
}
