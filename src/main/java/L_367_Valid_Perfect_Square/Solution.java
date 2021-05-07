/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_367_Valid_Perfect_Square;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean isPerfectSquare(int num) {
        long lo = 1, hi = num / 2;
        if (num == 1) {
            return true;
        }
        long x = num;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid * mid == x) {
                return true;
            } else if (mid * mid < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
}
