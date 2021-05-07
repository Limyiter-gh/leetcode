/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_371_Sum_of_Two_Integers;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int getSum(int a, int b) {
        int result = 0;
        int tmp = 1;
        int prev = 0;
        for (int i = 0; i < 32; i++) {
            int tmpA = (a & tmp) >> i;
            int tmpB = (b & tmp) >> i;
            int tmpRes = tmpA ^ tmpB ^ prev;
            prev = (prev & (tmpA ^ tmpB)) ^ (tmpA & tmpB);
            result |= tmpRes << i;
            tmp = tmp << 1;
        }
        return result;
    }
}
