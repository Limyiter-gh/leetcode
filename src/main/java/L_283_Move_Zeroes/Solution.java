/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_283_Move_Zeroes;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) {
                nums[count++] = num;
            }
        }
        for (; count < nums.length; count++) {
            nums[count] = 0;
        }
    }
}
