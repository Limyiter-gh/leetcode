/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_162_Find_Peak_Element;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        int left = 1, right = n - 2;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] > nums[mid + 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

//        int l = 0;
//        int r = nums.length - 1;
//        while (l <= r) {
//            if (l == r) {
//                return l;
//            }
//            int mid = (1 + r) / 2;
//            if (nums[mid] < nums[mid + 1]) {
//                l = mid + 1;
//            } else {
//                r = mid;
//            }
//        }
//        return -1;
