/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_189_Rotate_Array;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] temp = new int[len];
        if (len > k) {
            System.arraycopy(nums, 0, temp, k, len - k);
            System.arraycopy(nums, len - k, temp, 0, k);
            System.arraycopy(temp, 0, nums, 0, len);
        }
        if (len < k) {
            k = k% len;
            rotate(nums, k);
        }
    }
}

//        int temp;
//        for (int step = 0; step < k; step++) {
//            temp = nums[nums.length -1];
//            for (int i = nums.length - 1; i > 0; i--) {
//                nums[i] = nums[i-1];
//            }
//            nums[0] = temp;
//        }
//        Map<Integer, Integer> map = new HashMap<>();
//        int len = nums.length;
//        if (len > k) {
//            for (int i = len - k; i < len; i++) {
//                map.put(i - (len - k), nums[i]);
//            }
//            for (int i = 0; i < len - k; i++) {
//                map.put(i + k, nums[i]);
//            }
//            for (int i = 0; i < map.size(); i++) {
//                nums[i] = map.get(i);
//            }
//        }
