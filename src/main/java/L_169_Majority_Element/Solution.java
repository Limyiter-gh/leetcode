/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_169_Majority_Element;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int majorityElement(int[] nums) {
        int length = nums.length;
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else {
                if (nums[i] == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return candidate;
    }

    public int majorityElement(int[] nums, int numSize) {
        if (numSize == 1) {
            return nums[0];
        }
        int times = 1;
        int target = nums[0];

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == target) {
                times++;
            } else {
                times --;
                if (times == 0) {
                    times = 1;
                    target = nums[j];
                }
            }
        }
        return target;
    }
}
