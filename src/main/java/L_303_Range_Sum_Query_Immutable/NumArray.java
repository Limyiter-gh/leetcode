/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_303_Range_Sum_Query_Immutable;

/**
 *
 * @author Li Mingyang
 */
public class NumArray {

    private int[] dp;

    public NumArray(int[] nums) {
        dp = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            dp[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        return i == 0 ? dp[j] : dp[j] - dp[i - 1];
    }
}
