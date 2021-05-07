/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_198_House_Robber;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        int[] rst = new int[length];
        rst[0] = nums[0];
        rst[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            rst[i] = Math.max(rst[i - 2] + nums[i], rst[i - 1]);
        }
        return Math.max(rst[length - 1], rst[length - 2]);
    }
}
