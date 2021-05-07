/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_35_Search_Insert_Position;

/**
 *
 * @author Li Mingyang
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        int answer = 0;
        for (int i = 0; i < nums.length ; i++) {
            int current = nums[i];   
            if (current > target) {
                return answer;
            }else if (current < target) {
                answer ++;
            }           
        }
        return answer;
    }
}
