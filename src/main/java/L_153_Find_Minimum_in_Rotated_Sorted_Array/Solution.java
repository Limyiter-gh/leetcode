/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_153_Find_Minimum_in_Rotated_Sorted_Array;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int i = 0;
        int j = nums.length - 1;
        int mid = 0;
        if (nums[i] < nums[j]) {
            return nums[0];
        } else {
            while (i + 1 != j) {
                mid = (i + j) / 2;
                if (nums[mid] > nums[i]) {
                    i = mid;
                }
                if (nums[mid] < nums[j]) {
                    j = mid;
                }
            }
            return nums[j];
        }
    }
}
