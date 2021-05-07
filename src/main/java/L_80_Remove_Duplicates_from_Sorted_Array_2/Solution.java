/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_80_Remove_Duplicates_from_Sorted_Array_2;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                count++;
//            }
//        }
//        return nums.length - count;
        if (nums.length < 2) {
            return nums.length;
        }
        int prev = 1;
        int curr = 2;
        while (curr < nums.length) {
            if (nums[curr] == nums[prev] && nums[curr] == nums[prev - 1]) {
                curr++;
            } else {
                prev++;
                nums[prev] = nums[curr];
                curr++;
            }
        }
        return prev + 1;
    }
}
