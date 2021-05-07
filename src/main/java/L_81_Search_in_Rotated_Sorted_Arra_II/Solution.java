/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_81_Search_in_Rotated_Sorted_Arra_II;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            if (nums[m] == target) {
                return true;
            }
            if (nums[m] > nums[l]) {
                if (nums[m] > target && nums[l] <= target) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else if (nums[m] < nums[l]) {
                if (nums[m] < target && nums[r] >= target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                l++;
            }
        }
        return false;
    }
}

//        if (nums == null || nums.length == 0) {
//            return false;
//        }
//        int low = 0;
//        int high = nums.length - 1;
//        while (low <= high) {
//            int mid = low + (high - low) >> 1;
//            if (target < nums[mid]) {
//                if (nums[mid] < nums[high]) {
//                    high = mid - 1;
//                } else if (nums[mid] == nums[high]) {
//                    high--;
//                } else {
//                    if (target < nums[low]) {
//                        low = mid + 1;
//                    } else {
//                        high = mid - 1;
//                    }
//                }
//            } else if (target > nums[mid]) {
//                if (nums[low] < nums[mid]) {
//                    low = mid + 1;
//                } else if (nums[low] == nums[mid]) {
//                    low++;
//                } else {
//                    if (target > nums[high]) {
//                        high = mid - 1;
//                    } else {
//                        low = mid + 1;
//                    }
//                }
//            } else {
//                return true;
//            }
//        }
//        return false;
