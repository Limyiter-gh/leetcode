/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_290_Word_Pattern;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        if (pattern.length() != s.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            for (int j = 0; j < i; j++) {
                if ((pattern.charAt(i) != pattern.charAt(j) && s[i].equals(s[j]))
                        || (pattern.charAt(i) == pattern.charAt(j) && !s[i].equals(s[j]))) {
                    return false;
                }
            }
        }
        return true;
    }
}
//String[] strString = str.split(" ");
//        char[] charString = pattern.toCharArray();
//        if (strString.length != charString.length) {
//            return false;
//        }
//        Map<Character, String> map1 = new HashMap<>();
//        Map<String, Character> map2 = new HashMap<>();
//        for (int i = 0; i < strString.length; i++) {
//            char c = charString[i];
//            String s = strString[i];
//            if (!map1.containsKey(c)) {
//                if (!map2.containsKey(s)) {
//                    map1.put(c, s);
//                    map2.put(s, c);
//                }else{
//                    map2.put(" ", c);
//                }
//                map1.put(c, " ");
//            }
//        }
//        String pincou = "";
//        for (int i = 0; i < strString.length; i++) {
//            char c = charString[i];
//            pincou = pincou.concat(map1.get(c));
//            pincou = pincou.concat(" ");
//        }
//        pincou = pincou.trim();
//        return str.equals(pincou);
