/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L_561_Array_Partition_I;

import java.util.Arrays;

/**
 *
 * @author Li Mingyang
 */
public class Solution {

    public int arrayPairSum(int[] nums) {
        //给定一个长度为2n的整数数组，将数组分成n组，求每组数的最小值之和的最大值
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
        }
        return count;
    }
}
