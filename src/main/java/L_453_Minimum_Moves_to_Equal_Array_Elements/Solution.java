/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_453_Minimum_Moves_to_Equal_Array_Elements;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int minMoves(int[] nums) {
        int sum = 0;
        int min = 2147483647;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            sum += nums[i];
        }
        return sum - min * nums.length;
    }
}
