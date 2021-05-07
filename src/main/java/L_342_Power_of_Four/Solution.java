/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_342_Power_of_Four;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean isPowerOfFour(int num) {
//        if (num <= 0) {
//            return false;
//        }
//        if (Math.pow(4, Math.round(Math.log(num) / Math.log(4))) == num) {
//            return true;
//        }
//        return false;
        //判断二进制中1出现的位数是不是在奇数位。用0101 0101 ……来进行排除。16进制数为：0x55555555。
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
    }
}
