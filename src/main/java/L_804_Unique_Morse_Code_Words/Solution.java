/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_804_Unique_Morse_Code_Words;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author limyiter
 */
public class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> res = new HashSet<>();
        for (String word : words) {
            String tmp = "";
            char[] curs = word.toCharArray();
            for (int j = 0; j < curs.length; j++) {
                tmp += morse[curs[j] - 'a'];
            }
            res.add(tmp);
        }
        return res.size();
    }
}
