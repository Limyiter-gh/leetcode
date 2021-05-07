/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_345_Reverse_Vowels_of_a_String;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        char temp;
        while (start < end) {
            if (checkVowel(ch[start]) && checkVowel(ch[end])) {
                temp = ch[end];
                ch[end] = ch[start];
                ch[start] = temp;
                start++;
                end--;
            } else {
                if (!checkVowel(ch[start])) {
                    start++;
                }
                if (!checkVowel(ch[end])) {
                    end--;
                }
            }
        }
        return new String(ch);
    }

    public static boolean checkVowel(char c) {
        if ('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c
                || 'A' == c || 'E' == c || 'I' == c || 'O' == c || 'U' == c) {
            return true;
        }
        return false;
    }
}
