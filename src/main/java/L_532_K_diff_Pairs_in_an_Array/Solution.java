/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_532_K_diff_Pairs_in_an_Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int findPairs(int[] nums, int k) {
        int len = nums.length, result = 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> sameSet = new HashSet<Integer>();
        if (k != 0) {
            for (int i = 0; i < len; i++) {
                if (!set.contains(nums[i]) && set.contains(nums[i] - k)) {
                    result++;
                }
                set.add(nums[i]);
            }
        } else {
            for (int i = 0; i < len; i++) {
                if (!sameSet.contains(nums[i]) && set.contains(nums[i])) {
                    result++;
                    sameSet.add(nums[i]);
                }
                set.add(nums[i]);
            }
        }
        return result;
    }
}
