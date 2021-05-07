/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_506_Relative_Ranks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public String[] findRelativeRanks(int[] nums) {
        int n = nums.length;
        HashMap map = new HashMap();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            int index = (int) map.get(nums[i]);
            if (i == n - 1) {
                result[index] = "Gold Medal";
            } else if (i == n - 2) {
                result[index] = "Silver Medal";
            } else if (i == n - 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = Integer.toString(n - i);
            }
        }
        return result;
    }
}
