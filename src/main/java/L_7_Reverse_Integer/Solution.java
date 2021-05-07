/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_7_Reverse_Integer;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        int num = Math.abs(x);
        int res = 0;
        while (num != 0) {
            if (res > (Integer.MAX_VALUE - num % 10) / 10) {
                return 0;
            }
            res = res * 10 + num % 10;
            num /= 10;
        }
        return x > 0 ? res : -res;
    }
}

//        boolean flag = true;
//        if (x > 0) {
//            flag = false;
//        }
//        if (x == 0) {
//            return x;
//        }
//        int xx = Math.abs(x);
//        int result = 0;
//        while (xx != 0) {
//            result = result * 10 + xx % 10;
//            xx /= 10;
//        }
//        if (flag) {
//            result = 0 - result;
//        }
//        return result;
