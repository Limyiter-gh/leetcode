/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_520_Detect_Capital;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean detectCapitalUse(String word) {
        // 长度小于2，返回true  
        if (word.length() < 2) {
            return true;
        }
        // 如果全是大写字母  
        if (word.toUpperCase().equals(word)) {
            return true;
        }
        // 如果第一个字母之后全是小写（第一个字母大小写无所谓）  
        if (word.substring(1).toLowerCase().
                equals(word.substring(1))) {
            return true;
        }
        return false;
    }
}
