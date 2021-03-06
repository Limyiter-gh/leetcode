/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_137_Single_Number_2;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int[] bitnum = new int[32];
        int res = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < nums.length; j++) {
                bitnum[i] += (nums[j] >> i) & 1;
            }
            res |= (bitnum[i] % 3) << i;
        }
        return res;
    }
}
