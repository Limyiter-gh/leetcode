/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_66_Plus_One;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int[] plusOne(int[] digits) {
        int more = 0;
        int pos = digits.length - 1;
        do {
            int r = digits[pos] + 1;
            if (r >= 10) {
                digits[pos] = r - 10;
                more = 1;
            } else {
                digits[pos] = r;
                more = 0;
            }
            pos--;
        } while (more == 1 && pos >= 0);
        
        if (more ==1) {
            int[] result = new int[digits.length +1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }else{
            return digits;
        }
    }
}
