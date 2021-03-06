/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_383_Ransom_Note;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        //它的原理就是列出了magazine的字母表，然后算出了出现个数，
        //然后遍历ransomNote，保证有足够的字母可用，代码非常清晰
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
