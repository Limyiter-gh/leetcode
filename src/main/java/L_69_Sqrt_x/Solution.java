/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_69_Sqrt_x;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int mySqrt(int x) {
        if (x < 0) {
            return -1;
        }
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x / 2 + 1;
        while (left <= right) {
            int m = (left + right) / 2;
            if (m <= x / m && (m + 1) > x / (m + 1)) {
                //中间值的平方小于等于X，并且中间值加一的平方大于X
                return m;
            }
            if (m > x / m) {
                //中间值的平方比X大
                right = m - 1;
            } else {
                //中间值的平方比X小
                left = m + 1;
            }
        }
        return 0;
    }
}
