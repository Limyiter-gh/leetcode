/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_26_Remove_Duplicates_from_Sorted_Array;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                ++j;
            }else{
                nums[++i] = nums[j++];
            }
        }
        return i+1;
    }
}
