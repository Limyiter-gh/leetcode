/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_581_Shortest_Unsorted_Continuous_Subarray;

import java.util.Arrays;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int findUnsortedSubarray(int[] nums) {
        // 深拷贝  
        int[] tmp = nums.clone();
        Arrays.sort(tmp);
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low < n && nums[low] == tmp[low]) {
            low++;
        }
        // 注意是大于等于low  
        while (high >= low && nums[high] == tmp[high]) {
            high--;
        }
        return high - low + 1;
    }
}
