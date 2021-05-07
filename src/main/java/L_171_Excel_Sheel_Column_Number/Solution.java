/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_171_Excel_Sheel_Column_Number;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int titleToNumber(String s) {
        char[] a = s.toCharArray();
        int result = 0;
        for (char b : a) {
            result = result * 26 + ((int) b - 64);
        }
        return result;
    }
}
