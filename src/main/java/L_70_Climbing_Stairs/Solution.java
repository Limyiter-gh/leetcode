/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_70_Climbing_Stairs;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public int climbStairs(int n) {
        if (n < 2) {
            return n;
        }else{
            int[] step = new int[n];
            step[0] =1;
            step[1] =2;
            for (int i = 2; i < n; i++) {
                step[i] = step[i-1] + step[i-2];
            }
            return step[n-1];
        }
    }
}
