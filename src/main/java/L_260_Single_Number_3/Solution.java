/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_260_Single_Number_3;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int[] singleNumber(int[] nums) {
        int[] answer = new int[2];
        if (nums.length < 2) {
            return nums;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        String hex = Long.toBinaryString(result);
        int x = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            if (hex.charAt(i) == '1') {
                x = (int) Math.pow(2, hex.length() - 1 - i);
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & x) == x) {
                answer[0] ^= nums[i];
            }else{
                answer[1] ^= nums[i];
            }
        }
        return answer;
    }
}
