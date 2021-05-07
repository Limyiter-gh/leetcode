/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_238_Product_of_Array_Except_Self;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length ==0) {
            return null;
        }
        int[] answer = new int[nums.length];
        answer[nums.length - 1] = 1;
        for (int i = nums.length -2; i >= 0; i--) {
            answer[i] = answer[i+1] * nums[i+1];
        }
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] *= left;
            left *= nums[i];
        }
        return answer;
    }
}
