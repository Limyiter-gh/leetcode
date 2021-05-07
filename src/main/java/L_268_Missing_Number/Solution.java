/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_268_Missing_Number;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i <= nums.length; ++i) {
            sum ^= i;
        }
        for (int i = 0; i < nums.length; ++i) {
            sum ^= nums[i];
        }
        return sum;
    }
}
