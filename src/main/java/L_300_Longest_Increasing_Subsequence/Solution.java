/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_300_Longest_Increasing_Subsequence;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int answer = 1;
        int[] minLast = new int[nums.length];
        minLast[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int pos = bs(minLast, 0, answer - 1, nums[i]);
            minLast[pos] = nums[i];
            if (pos + 1 > answer) {
                answer = pos + 1;
            }
        }
        return answer;
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//        int[] count = new int[nums.length];
//        int answer = 1;
//        for (int i = 0; i < nums.length; i++) {
//            count[i] = 1;
//            for (int j = 0; j < i; j++) {
//                if (nums[j] < nums[i] && count[j] + 1 > count[i]) {
//                    count[i] = count[j] + 1;
//                }
//            }
//            if (answer < count[i]) {
//                answer = count[i];
//            }
//        }
//        return answer;
    }

    private int bs(int[] arr, int l, int r, int key) {
        if (arr[r] < key) {
            return r + 1;
        }
        while (l < r) {
            int mid = l + (r - 1) / 2;
            if (arr[mid] < key) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
