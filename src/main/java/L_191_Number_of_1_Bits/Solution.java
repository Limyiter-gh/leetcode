/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_191_Number_of_1_Bits;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int hammingWeight(int n) {
        String string = Integer.toBinaryString(n);
        char[] sChar = string.toCharArray();
        int result = 0;
        for (char t : sChar) {
            if (t == '1') {
                result++;
            }
        }
        return result;
    }
}
